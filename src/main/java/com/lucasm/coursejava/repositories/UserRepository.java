package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User,Long> {

}
