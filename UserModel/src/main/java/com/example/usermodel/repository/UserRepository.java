package com.example.usermodel.repository;

import com.example.usermodel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}




//TODO spesifik query yazılacak erenden dönüş beklenecek