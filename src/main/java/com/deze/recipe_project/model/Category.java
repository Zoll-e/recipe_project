package com.deze.recipe_project.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;
import java.util.UUID;


@Getter
@Setter
@Document
public class Category {

    private String id = UUID.randomUUID().toString();

    private String description;

    @DBRef
    private Set<Recipe> recipes;
}
