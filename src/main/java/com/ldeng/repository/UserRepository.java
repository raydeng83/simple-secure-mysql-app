package com.ldeng.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ldeng.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername (String username);
}
