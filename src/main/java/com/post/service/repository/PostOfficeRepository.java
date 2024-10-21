package com.post.service.repository;

import com.post.service.model.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
}
