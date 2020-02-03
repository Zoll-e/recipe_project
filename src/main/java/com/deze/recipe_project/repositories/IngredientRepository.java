package com.deze.recipe_project.repositories;

import com.deze.recipe_project.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long > {
}
