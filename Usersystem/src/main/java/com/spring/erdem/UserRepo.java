package com.spring.erdem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.erdem.ui.entity.UserEntity;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);

}
