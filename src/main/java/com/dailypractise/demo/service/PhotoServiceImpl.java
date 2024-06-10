package com.dailypractise.demo.service;

import com.dailypractise.demo.collection.Photo;
import com.dailypractise.demo.repository.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoRepository photoRepository;

    @Override
    public String addPhoto(String originalFilename, MultipartFile image) throws IOException {

        Photo photo = Photo.builder()
                        .title(originalFilename)
                        .photo(new Binary(BsonBinarySubType.BINARY, image.getBytes()))
                        .build();
        return photoRepository.save(photo).getId();
    }

    @Override
    public Photo getPhoto(String id) {
        return photoRepository.findById(id).get();
    }
}
