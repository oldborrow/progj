package com.example.progj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "authors")
public class Author {
    @Id
    private Long id;
    String resume;
    String name;
}
