package com.deze.recipe_project.controllers;

import com.deze.recipe_project.model.Category;
import com.deze.recipe_project.model.UnitOfMeasure;
import com.deze.recipe_project.repositories.CategoryRepository;
import com.deze.recipe_project.repositories.RecipeRepository;
import com.deze.recipe_project.repositories.UnitOfMeasureRepository;
import com.deze.recipe_project.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeservice;

    public IndexController(RecipeService recipeservice) {
        this.recipeservice = recipeservice;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        log.debug("im on the index page");
        model.addAttribute("recipes", recipeservice.getRecipes());

        return "index";
    }
}
