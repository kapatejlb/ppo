package com.example.zvigernotes.callbacks;

import com.example.zvigernotes.model.Note;

public interface NoteEventListener {

    void onNoteClick(Note note);

    void onNoteLongClick(Note note);

}
