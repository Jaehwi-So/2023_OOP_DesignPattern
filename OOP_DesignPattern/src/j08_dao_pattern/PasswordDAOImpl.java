package j08_dao_pattern;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class PasswordDAOImpl implements PasswordDAO{
    final static String DB_FILE_NAME = "password.db";
    final static String DB_TABLE_NAME = "password";

    Connection connection = null;
    ResultSet rs = null;
    Statement statement = null;

    public PasswordDAOImpl(){
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:" + DB_FILE_NAME);
            statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.
            final String table = " (URL text PRIMARY KEY, ID text, PASSWORD text)";

            // create table
            statement.executeUpdate("DROP TABLE IF EXISTS " + DB_TABLE_NAME);
            statement.executeUpdate("CREATE TABLE " + DB_TABLE_NAME + table);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void insert(PasswordInfo p) {
        try {
            String fmt = "INSERT INTO %s VALUES('%s', '%s', '%s')";
            String query = String.format(fmt, DB_TABLE_NAME, p.getUrl(), p.getId(), p.getPassword());
            statement.execute(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PasswordInfo> findAll() {
        ArrayList<PasswordInfo> infoList = new ArrayList<>();
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME);
            while (rs.next()) {
                infoList.add(new PasswordInfo(rs.getString("url"), rs.getString("id"),
                        rs.getString("password")));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return infoList;
    }

    @Override
    public PasswordInfo findByKey(String url) {
        PasswordInfo info = null;
        try {
            rs = statement.executeQuery("SELECT * FROM " + DB_TABLE_NAME + " WHERE URL = '" + url + "'");
            while (rs.next()) {
                info = new PasswordInfo(rs.getString("url"), rs.getString("id"),
                        rs.getString("password"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return info;
    }

    @Override
    public void update(PasswordInfo p) {

        PasswordInfo info = this.findByKey(p.getUrl());
        if (info != null) {
            try {
                String fmt = "UPDATE %s SET url = '%s', id = '%s', password = '%s' WHERE url = '%s'";
                String query = String.format(fmt, DB_TABLE_NAME, p.getUrl(), p.getId(), p.getPassword(), p.getUrl());
                statement.execute(query);
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void delete(String url) {
        try {
            String fmt = "DELETE FROM %s WHERE url = '%s'";
            String q = String.format(fmt, DB_TABLE_NAME, url);

            statement.execute(q);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(PasswordInfo p) {
        this.delete(p.getUrl());
    }
}
