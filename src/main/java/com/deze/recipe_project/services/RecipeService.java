package com.deze.recipe_project.services;

import com.deze.recipe_project.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;


public interface RecipeService {
    Set<Recipe> getRecipes();
}
