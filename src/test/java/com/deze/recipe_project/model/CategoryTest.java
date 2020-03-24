package com.deze.recipe_project.model;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;


    @BeforeEach
    public void setUp(){
        category = new Category();

    }

    @Test
    public void getId() throws Exception{
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() throws Exception{

        String stringValue = "sor";

        category.setDescription(stringValue);
        assertEquals(stringValue, category.getDescription());
    }

    @Test
    void getRecipes() throws Exception {

        Recipe recipeValue = new Recipe();


    }
}