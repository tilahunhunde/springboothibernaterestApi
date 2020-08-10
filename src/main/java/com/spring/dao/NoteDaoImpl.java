package com.spring.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.model.Category;
import com.spring.model.Note;

public class NoteDaoImpl extends AbstractDao implements NoteDao {

	@Override
	public void createNote(Note note) {
		 persist(note);
		
	}

	@Override
	public void deleteNote(int Id) {
		Query query = getSession().createSQLQuery("delete from Category where UserId = :?");
        ((org.hibernate.query.Query) query).setInteger("UserId",Id);
        query.executeUpdate();
	}

	@Override
	public List<Note> getAllNotesByUserId(String userId) {
		 Criteria criteria = getSession().createCriteria(Category.class);
	        return (List<Note>) criteria.list();
	}

	@Override
	public Note getNoteById(int id) throws ClassNotFoundException {
		Criteria criteria = getSession().createCriteria(Note.class);
        criteria.add(Restrictions.eq("Id",id));
        return (Note) criteria.uniqueResult();
	}

	@Override
	public void UpdateNote(Note note) {
		getSession().update(note);
	}
	
	}


