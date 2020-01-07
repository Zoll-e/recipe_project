package com.deze.recipe_project.commands;


import com.deze.recipe_project.model.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private RecipeCommand recipe;
    private String recipeNotes;
}
