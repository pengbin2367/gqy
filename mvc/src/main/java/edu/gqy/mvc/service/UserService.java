package edu.gqy.mvc.service;

import edu.gqy.mvc.povo.User;

import java.util.List;

public interface UserService {
    boolean login(String userId, String userPwd);

    List<User> getUsers();

    void deleteById(String deleteId);

    void updateById(User user);
}
