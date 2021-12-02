package com.adrian.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserInMemoryRepository implements UserRepository {

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
    public User delete(User user) {
        idToUser.remove(user.getId()); //dopisalem sam
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<User>(idToUser.values());
        return list;
    }



}
