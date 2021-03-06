package com.deze.recipe_project.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Lob;


@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private RecipeCommand recipe;
    private String recipeNotes;
}
