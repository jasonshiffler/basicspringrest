package com.shiffler.springdatarest.basicspringrest.Repository;

import com.shiffler.springdatarest.basicspringrest.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {



}
