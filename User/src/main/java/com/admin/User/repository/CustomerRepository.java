package com.admin.User.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.admin.User.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
