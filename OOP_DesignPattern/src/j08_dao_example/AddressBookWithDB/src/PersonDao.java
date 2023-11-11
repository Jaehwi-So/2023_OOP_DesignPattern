package j08_dao_example.AddressBookWithDB.src;

import java.util.List;

public interface PersonDao {
    public void insert(j08_dao_example.AddressBookWithDB.src.Person p);
    public List<j08_dao_example.AddressBookWithDB.src.Person> findAll();
    public j08_dao_example.AddressBookWithDB.src.Person findById(int id);
    public void update(int id, j08_dao_example.AddressBookWithDB.src.Person p);
    public void delete(int id);
    public void delete(Person p);
}
