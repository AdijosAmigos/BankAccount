import java.util.List;

public interface UserRepository {
     User save(User user);
     User getById(int id);

     void delete(User user);
     List<User> findAll();


}
