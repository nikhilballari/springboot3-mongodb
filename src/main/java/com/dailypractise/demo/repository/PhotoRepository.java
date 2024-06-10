package com.dailypractise.demo.repository;

import com.dailypractise.demo.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
