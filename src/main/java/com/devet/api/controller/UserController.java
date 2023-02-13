package com.devet.api.controller;

import com.devet.api.model.User;
import com.devet.api.service.UserService;
import com.devet.api.util.MyResponse;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = {"/users", "/users/"})
public class UserController {
   @Autowired
   UserService userService;
   
   /**
    * This function return json data with multi type
    *
    * @return Json object
    */
   @GetMapping
   public ObjectNode getAll() {
      
      return MyResponse.success(userService.getAllUser(), 200, null);
   }
   
   @GetMapping("{id}")
   public ObjectNode getOne(@PathVariable("id") String userId) {
      try {
         return MyResponse.success(userService.getUser(userId), 200, null);
      } catch (Exception e) {
         return MyResponse.error(null, 400, "User doesn't exist or server error");
      }
   }
   
   @PostMapping
   public ObjectNode create(@RequestBody User newUser) {
      try {
         userService.saveOrUpdate(newUser);
         return MyResponse.success("User created successfully" , 201);
      } catch (Exception e) {
         return MyResponse.error(null, 500, "Internal Server Error");
      }
   }
   
   @PutMapping
   public ObjectNode update(@RequestBody User newUserData) {
      try {
         userService.saveOrUpdate(newUserData);
         return MyResponse.success(null, 200, "User updated successfully");
      } catch (Exception e) {
         return MyResponse.error(null, 500, "Server Error");
      }
   }
   
   @DeleteMapping("{id}")
   public ObjectNode delete(@PathVariable("id") String userId) {
      try {
         userService.del(userId);
         return MyResponse.success(String.format("User with uuid %s was deleted", userId), 200);
      } catch (Exception e) {
         return MyResponse.error(null, 500, "Server Error or user does not exist");
      }
   }
}
