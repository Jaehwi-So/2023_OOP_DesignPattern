package j10_dao_pattern;

import java.util.List;

public class Main {
    public static void main(String[] args){
        PasswordDAO dao = new PasswordDAOImpl();

        //insert data
        //https://www.smu.ac.kr, "smu", "abcde" https://www.smu2.ac.kr, "smu2", "abcde"
        System.out.println("Insert Data");
        PasswordInfo info1 = new PasswordInfo("https://www.smu.ac.kr", "smu", "abcde");
        PasswordInfo info2 = new PasswordInfo("https://www.smu2.ac.kr", "smu2", "abcde");
        dao.insert(info1);
        dao.insert(info2);

        //select all
        System.out.println("Select All");
        List<PasswordInfo> list = dao.findAll();
        for(PasswordInfo p : list){
            System.out.println(p.toString());
        }

        //update set
        System.out.println("Update https://www.smu2.ac.kr(smu2 -> smu1)");
        PasswordInfo info = dao.findByKey("https://www.smu2.ac.kr");
        info.setId("smu1");
        dao.update(info);
        System.out.println("Select one https://www.smu2.ac.kr");
        info = dao.findByKey("https://www.smu2.ac.kr");
        System.out.println(info.toString());

        //delete and select all
        System.out.println("Delete https://www.smu2.ac.kr");
        dao.delete("https://www.smu2.ac.kr");
        System.out.println("Select All");
        list = dao.findAll();
        for(PasswordInfo p : list){
            System.out.println(p.toString());
        }

    }
}
