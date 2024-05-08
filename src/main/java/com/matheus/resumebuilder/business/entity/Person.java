package com.matheus.resumebuilder.business.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.matheus.resumebuilder.business.entity.common.TimestampableEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Person extends TimestampableEntity {

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("person")
    private List<Resume> resumes;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
