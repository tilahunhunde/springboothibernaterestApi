package com.spring.service;

import java.util.List;

import com.spring.model.Note;

public interface NoteService {
	
	public void saveNote(Note note);

	public void deleteNote(int noteId);

	public List<Note> getAllNotesByUserId(String userId);

	public Note getNoteById(int noteId) throws ClassNotFoundException;

	public void UpdateNote(Note note);
}
