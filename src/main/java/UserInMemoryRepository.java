import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class UserInMemoryRepository implements UserRepository{

    private final HashMap<Integer, User> idToUser;

    public UserInMemoryRepository(HashMap<Integer, User> idToUser) {
        this.idToUser = idToUser;
    }



    @Override
    public User save(User user) {
        idToUser.put(user.getId(), user);
        return user;
    }

    @Override
    public User getById(int id) {
         return idToUser.get(id);
    }

    @Override
    public void delete(User user) {
        idToUser.remove(user.getId()); //dopisalem sam
    }

    @Override
    public List<User> findAll() {

        return null;
    }

}
