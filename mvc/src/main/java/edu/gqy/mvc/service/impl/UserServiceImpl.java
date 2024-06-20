package edu.gqy.mvc.service.impl;

import edu.gqy.mvc.dao.UserDao;
import edu.gqy.mvc.dao.impl.UserDaoImpl;
import edu.gqy.mvc.povo.User;
import edu.gqy.mvc.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoImpl();

    @Override
    public boolean login(String userId,String userPwd) {
        User user=userDao.getUserById(userId);
        if(user!=null) {
            return userPwd.equals(user.getUserPwd());
        }
        return false;
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

    @Override
    public void deleteById(String deleteId) {
        userDao.deleteById(deleteId);
    }

    @Override
    public void updateById(User user) {
        userDao.updateById(user);
    }
}
