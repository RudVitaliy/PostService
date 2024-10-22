package com.post.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PostOffice {

    @Id
    private long id;

    //@Column(unique = true, nullable = false)
    private int postNumber;

    private String streetName;
    private int streetNumber;
    private String city;
}
