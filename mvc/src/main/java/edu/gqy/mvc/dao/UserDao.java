package edu.gqy.mvc.dao;

import edu.gqy.mvc.povo.User;

import java.util.List;

public interface UserDao {
    User getUserById(String userId);

    List<User> getUsers();

    void deleteById(String deleteId);

    void updateById(User user);
}
