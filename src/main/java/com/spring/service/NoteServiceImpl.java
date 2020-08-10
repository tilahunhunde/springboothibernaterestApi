package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.CategoryDao;
import com.spring.dao.NoteDao;
import com.spring.dao.UserDao;
import com.spring.model.Category;
import com.spring.model.Note;

public class NoteServiceImpl implements NoteService {
	@Autowired
	private NoteDao Dao;
	@Override
	public void saveNote(Note note) {
		Dao.createNote(note);
		
	}

	@Override
	public void deleteNote(int Id) {
		Dao.deleteNote(Id);
		
	}

	@Override
	public List<Note> getAllNotesByUserId(String Id) {
		return Dao.getAllNotesByUserId(Id);
	}

	@Override
	public Note getNoteById(int Id) throws ClassNotFoundException {
		return Dao.getNoteById(Id);
	}

	@Override
	public void UpdateNote(Note note) {
		Dao.UpdateNote(note);
		
	}
	

}
