package com.shoque.notentask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkBook {
	private String title;
	private List<Task> taskList;
	private List<Note> totalNotelList;
	private Date createdAt;
	
	public void addToTotalNoteList(Note note){
		
		totalNotelList.add(note);
	}
	
	public void removeFromTotalNoteList(int location){
		totalNotelList.remove(location);
	}

	public WorkBook(String title) {
		this.title = title;
		totalNotelList = new ArrayList<Note>();
	}
	

}

