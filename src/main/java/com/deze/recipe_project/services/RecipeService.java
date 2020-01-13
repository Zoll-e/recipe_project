package com.deze.recipe_project.services;

import com.deze.recipe_project.commands.RecipeCommand;
import com.deze.recipe_project.model.Recipe;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;


public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    @Transactional
    RecipeCommand findCommandById(Long l);
}
