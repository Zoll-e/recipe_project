package com.deze.recipe_project.converters;


import com.deze.recipe_project.commands.NotesCommand;
import com.deze.recipe_project.model.Notes;
import com.sun.istack.Nullable;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand notesCommand) {

        if(notesCommand == null){
            return null;
        }

        Notes notes = new Notes();

        notes.setId(notesCommand.getId());
        notes.setRecipeNotes(notesCommand.getRecipeNotes());
        return notes;
    }
}
