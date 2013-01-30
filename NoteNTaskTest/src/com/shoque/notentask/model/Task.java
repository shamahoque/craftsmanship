package com.shoque.notentask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
	private Date startDate;
	private Date endDate;
	private String name; 
	private Note note ;
	private List<Task> taskList;
	private Priority priority;
	
	
	
	public Task(String name) {
		
		this.name = name;
		
		taskList = new ArrayList<Task>();
	}

	public void addTask(Task task){
		
	}
	
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	} 

}
