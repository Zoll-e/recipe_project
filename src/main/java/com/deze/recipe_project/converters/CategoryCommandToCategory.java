package com.deze.recipe_project.converters;

import com.deze.recipe_project.commands.CategoryCommand;
import com.deze.recipe_project.model.Category;
import com.sun.istack.Nullable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());

        category.setDescription(source.getDescription());
        return category;
    }
}
