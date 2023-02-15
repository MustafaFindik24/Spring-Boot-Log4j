package com.example.usermodel.services;

import com.example.usermodel.model.User;
import com.example.usermodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        User oldUser=null;
        Optional<User> optionalUser = userRepository.findById(user.getId());
        if(optionalUser.isPresent()){
            oldUser = optionalUser.get();
            oldUser.setUserName(user.getUserName());
            oldUser.setFirstName(user.getFirstName());
            oldUser.setLastName(user.getLastName());
            oldUser.setEmail(user.getEmail());
            oldUser.setPhoneNo(user.getPhoneNo());
            oldUser.setBirthday(user.getBirthday());
            userRepository.save(oldUser);
        }
        else{
            return new User();
        }
        return oldUser;
    }

    @Override
    public String deleteUserById(Long id) {
        userRepository.deleteById(id);
        return "User got deleted";
    }

    /* @Override
    public List<User> saveUsers(List<User> users) {
        return userRepository.saveAll(users);
    }*/

}
