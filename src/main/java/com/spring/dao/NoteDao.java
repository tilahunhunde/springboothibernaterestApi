package com.spring.dao;

import java.util.List;

import com.spring.model.Note;

public interface NoteDao {
	public void createNote(Note note);

	public void deleteNote(int noteId);

	public List<Note> getAllNotesByUserId(String userId);

	public Note getNoteById(int noteId) throws ClassNotFoundException;

	public void UpdateNote(Note note);
}
