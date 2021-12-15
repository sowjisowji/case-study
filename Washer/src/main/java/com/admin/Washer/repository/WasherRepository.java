package com.admin.Washer.repository;
import com.admin.Washer.Model.Washer;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface WasherRepository extends MongoRepository<Washer,Integer> {

}
