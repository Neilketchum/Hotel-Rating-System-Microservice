package com.hotelmanagment.user.service.repositories;

import com.hotelmanagment.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,String> {
    //String because id is primary key and is string type

}
