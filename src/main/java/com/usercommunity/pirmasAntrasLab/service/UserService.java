package com.usercommunity.pirmasAntrasLab.service;

import com.usercommunity.pirmasAntrasLab.model.User;
import com.usercommunity.pirmasAntrasLab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user)
    {
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users)
    {
        return repository.saveAll(users);
    }

    public List<User> getUsers()
    {
        return repository.findAll();
    }

    public User getUserById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public String deleteUser(int id)
    {
        repository.deleteById(id);
        return "product removed ! " + id;
    }

    public User updateUser(User user)
    {
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setNumber(user.getNumber());
        return repository.save(existingUser);
    }
}
