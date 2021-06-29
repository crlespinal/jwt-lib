package com.bankunited.jwtlib.repo;

import com.bankunited.jwtlib.model.Jwt;

import org.springframework.data.repository.CrudRepository;

public interface JwtRepo extends CrudRepository<Jwt, Long>{
    
}
