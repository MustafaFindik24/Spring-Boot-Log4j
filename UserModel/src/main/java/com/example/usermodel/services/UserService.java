package com.example.usermodel.services;

import com.example.usermodel.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {                               //Bu interface i projede yazdığımız metotları kolayca görebilmek için kullandık
    public User saveUser(User user);
 // public List<User> saveUsers(List<User> users);
    public Optional<User> getUserById(Long id);
    public List<User> getUsers();
    public User updateUser(User user);
    public String deleteUserById(Long id);

}
