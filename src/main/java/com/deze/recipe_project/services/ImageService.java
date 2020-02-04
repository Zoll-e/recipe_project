package com.deze.recipe_project.services;


import com.deze.recipe_project.commands.RecipeCommand;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}


