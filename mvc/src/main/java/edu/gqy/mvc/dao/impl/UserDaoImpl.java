package edu.gqy.mvc.dao.impl;

import edu.gqy.mvc.dao.BaseDao;
import edu.gqy.mvc.dao.UserDao;
import edu.gqy.mvc.povo.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public User getUserById(String userId) {
        String sql="select * from user where userId=?";
        return (User) baseQuery(User.class, sql, userId).get(0);
    }

    @Override
    public List<User> getUsers() {
        String sql = "select * from user";
        return baseQuery(User.class, sql);
    }

    @Override
    public void deleteById(String deleteId) {
        String sql = "delete from user where userId=?";
        baseUpdate(sql, deleteId);
    }

    @Override
    public void updateById(User user) {
        String sql = "update user set name = ?, birth = ?, nation = ?, sex = ?, hobby = ?, memo = ? where userId = ?";
        baseUpdate(sql, user.getName(), user.getBirth(), user.getNation(), user.getSex(), user.getHobby(), user.getMemo(), user.getUserId());
    }
}
