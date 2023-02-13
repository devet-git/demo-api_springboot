package com.devet.api.service;

import com.devet.api.model.User;
import com.devet.api.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
   @Autowired
   UserRepo repo;
   
   public List<User> getAllUser() {
      List<User> users = new ArrayList<>();
      repo.findAll().forEach(u -> users.add(u));
      return users;
   }
   
   public User getUser(String id) {
      return repo.findById(id).get();
   }
   
   public void saveOrUpdate(User user) {
      repo.save(user);
   }
   
   public void del(String userId) {
      repo.deleteById(userId);
   }
}
