package com.paulinoVagnerworkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulinoVagnerworkshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
