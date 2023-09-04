package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> getlistUsers();
   List<User> getlistUsersByModelSeries(String model, int series);
}
