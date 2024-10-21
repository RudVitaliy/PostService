package com.post.service.service;

import com.post.service.model.PostOffice;

import java.util.List;
import java.util.Optional;

public interface PostOfficeService {

    void createPostOffice(PostOffice postOffice);
    List<PostOffice> findAllPostOffices();
    Optional<PostOffice> findPostOfficeById(long id);
    void updatePostOffice(PostOffice postOffice, long id);
    void deletePostOffice(Long id);
}
