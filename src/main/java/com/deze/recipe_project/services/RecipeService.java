package com.deze.recipe_project.services;

import com.deze.recipe_project.commands.RecipeCommand;
import com.deze.recipe_project.model.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
