package com.hotelmanagment.user.service.services;

import com.hotelmanagment.user.service.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> gettAllUser();

    User getUser(String userId);

}
