package com.spring.dao;

import com.spring.model.Login;
import com.spring.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
