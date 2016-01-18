package com.getvee.sample.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.getvee.sample.mongo.bean.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query(value = "{'name' : {'$regex':?0,'$options': 'i'}}")
	List<User> getUserByNameLike(String name);

}
