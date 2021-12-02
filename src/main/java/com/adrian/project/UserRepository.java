package com.adrian.project;

import java.util.List;

public interface UserRepository {
     User save(User user);
     User getById(int id);

     User delete(User user);
     List<User> findAll();


}
