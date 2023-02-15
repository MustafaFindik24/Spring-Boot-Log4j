package com.example.usermodel.controller;

import com.example.usermodel.model.User;
import com.example.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//TODO restcontroller ile controller arasındaki fark araştırılacak - Richardson modeline bakılacak, servisler ona göre ayarlanacak
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<User> getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @RequestMapping(/*value = "/{id}",*/method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUserById(id);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public User updateUser(User user) { return userService.updateUser(user); }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUsers() { return userService.getUsers(); }
    //TODO Requestparam konusuna bakılacak


    /*@RequestMapping(value = ("/all"), method = RequestMethod.POST)
    public List<User> addUsers(@RequestBody List<User> users){
        return userService.saveUsers(users);
    }*/
}
