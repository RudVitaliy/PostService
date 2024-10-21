package com.post.service.service;

import com.post.service.model.PostOffice;
import com.post.service.repository.PostOfficeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostOfficeImpl implements PostOfficeService{

    private final PostOfficeRepository postOfficeRepository;

    private List<PostOffice> postOfficeList = new ArrayList<>();
    {
        for (int i = 0; i < 100; i++) {
            postOfficeList.add(new PostOffice(i, i*10, "Street " + i, i*2, "City" + i));
        }
    }

    public PostOfficeImpl(PostOfficeRepository postOfficeRepository) {
        this.postOfficeRepository = postOfficeRepository;
    }

    @Override
    public void createPostOffice(PostOffice postOffice) {
        postOfficeRepository.save(postOffice);
    }

    @Override
    public List<PostOffice> findAllPostOffices() {
        return postOfficeList;
//        return postOfficeRepository.findAll();
    }

    @Override
    public Optional<PostOffice> findPostOfficeById(long id) {
        return postOfficeRepository.findById(id);
    }

    @Override
    public void updatePostOffice(PostOffice postOffice, long id) {
        postOffice.setId(id);
        postOfficeRepository.save(postOffice);
    }

    @Override
    public void deletePostOffice(Long id) {
        postOfficeRepository.deleteById(id);
    }
}
