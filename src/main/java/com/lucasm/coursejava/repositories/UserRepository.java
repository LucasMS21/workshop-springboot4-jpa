package com.lucasm.coursejava.repositories;

import com.lucasm.coursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User,Long> {

}
