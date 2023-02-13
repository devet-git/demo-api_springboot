package com.devet.api.repository;

import com.devet.api.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
/*
   List<User> findByName(String name);
   User findById(String id);
*/
}
