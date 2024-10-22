package com.post.service.controller;

import com.post.service.model.PostOffice;
import com.post.service.service.PostOfficeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api/v1/postOffice")
@RestController
public class PostOfficeController {

    private final PostOfficeService postOfficeService;

    public PostOfficeController(PostOfficeService postOfficeService) {
        this.postOfficeService = postOfficeService;
    }

    @PostMapping("/create")
    public String createPostOffice(PostOffice postOffice) {
        postOfficeService.createPostOffice(postOffice);
        return "Post Office number " + postOffice.getPostNumber() + " was successfully created";
    }

    @GetMapping("/findAll")
    public List<PostOffice> findAllPostOffices() {
        return postOfficeService.findAllPostOffices();
    }

    @GetMapping("/findById/{id}")
    public PostOffice findPostOfficeById(@PathVariable long id) {
        return postOfficeService.findPostOfficeById(id).orElse(null);
    }

    @PatchMapping("/update/{id}")
    public String updatePostOffice(@PathVariable long id, @RequestBody PostOffice postOffice){
        postOfficeService.updatePostOffice(postOffice, id);
        return "Post Office was successfully updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deletePostOffice(@PathVariable long id){
        postOfficeService.deletePostOffice(id);
        return "Post Office was successfully deleted";
    }
}
