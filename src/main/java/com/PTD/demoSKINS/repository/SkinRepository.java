package com.PTD.demoSKINS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.PTD.demoSKINS.model.Skin;

import java.util.List;

public interface SkinRepository extends MongoRepository<Skin, String> {
    List<Skin> findByUserId(String userId);
}

