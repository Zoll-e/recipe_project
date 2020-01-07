package com.deze.recipe_project.converters;

import com.deze.recipe_project.commands.UnitOfMeasureCommand;
import com.deze.recipe_project.model.UnitOfMeasure;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.stereotype.Component;

import org.springframework.core.convert.converter.Converter;


@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Synchronized
    @Nullable
    @Override
    public UnitOfMeasureCommand convert (UnitOfMeasure source) {
            if (source == null) {
                return null;
            }

            final UnitOfMeasureCommand unitOfMeasureCommand = new UnitOfMeasureCommand();
            unitOfMeasureCommand.setId((source.getId()));
            unitOfMeasureCommand.setDescription((source.getDescription()));
            return unitOfMeasureCommand;
        }
    }

