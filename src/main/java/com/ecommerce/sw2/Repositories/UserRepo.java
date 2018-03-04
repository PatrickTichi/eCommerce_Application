package com.ecommerce.sw2.Repositories;


import org.springframework.data.repository.CrudRepository;
import com.ecommerce.sw2.Models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String> {
}
