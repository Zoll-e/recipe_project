package com.deze.recipe_project.repositories;

import com.deze.recipe_project.model.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
