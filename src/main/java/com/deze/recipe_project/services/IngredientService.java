package com.deze.recipe_project.services;

import com.deze.recipe_project.commands.IngredientCommand;
import com.deze.recipe_project.model.Ingredient;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
