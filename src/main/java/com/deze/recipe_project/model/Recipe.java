package com.deze.recipe_project.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Recipe {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String description;
    private Integer cookTime;
    private Integer prepTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;


    @Lob
    private Byte[] image;

    //Ordinal is default
    //odinal gets persisted as "1-2-3"
    //should use enumType.STRING
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;


    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    //persist all operations , property on the child class "recipe"
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients = new HashSet<>();
    //either
    //private List<Ingredient> ingredientList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();


    // set notes + this recipe method
    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            notes.setRecipe(this);
        }
    }
    //Add ingredient method
    public  Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.ingredients.add(ingredient);
        return this;
    }



}

