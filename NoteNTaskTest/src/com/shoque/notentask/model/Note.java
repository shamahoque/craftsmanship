package com.shoque.notentask.model;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Note {
	private int id;
	private String title;
	private List<Note> noteList;
	private String text;
	private Date createdAt;
	private Date updatedAt;
  //  private WorkBook workBook;
	
	
	public Note( ) {
		noteList = new ArrayList<Note>();
		createdAt = new Date();
		//this.workBook = workBook;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


              

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

	public void addNoteToList(Note note) {
		noteList.add(note);
		

	}
	
	public void removeNoteFromList(int location){
	 noteList.remove(location);
	}
	
	public void updateNoteList(int location,Note note){
		noteList.set(location, note);
	}
	
	public Note getNoteFromList(int location){
	return	noteList.get(location);
		
	}
	

}
