package com.shoque.notentask.helper;
import com.shoque.notentask.model.*;

public class Test {
	public static void main(String[] args) {
		WorkBook workbook = new WorkBook("Web Development");
		
		Note note = new Note();
	
		
		
		note.setTitle("Bootstrap Info");
		note.setText("Sleek, intuitive, and powerful front-end framework for faster and easier web development.");
		
		
		workbook.addToTotalNoteList(note);
	
		
		
		
		Note linknote1 = new Note();
        linknote1.setTitle("Grid system");
        
        linknote1.setText("The default Bootstrap grid system utilizes 12 columns, making for a 940px wide container without responsive features enabled. With the responsive CSS file added, the grid adapts to be 724px and 1170px wide depending on your viewport. Below 767px viewports, the columns become fluid and stack vertically.");
	   
        Note linkNote2 = new Note();
        
        linkNote2.setTitle("Basic grid HTML");
        linkNote2.setText("For a simple two column layout, create a .row and add the appropriate number of .span* columns. As this is a 12-column grid, each .span* spans a number of those 12 columns, and should always add up to 12 for each row (or the number of columns in the parent");
		note.addNoteToList(linknote1);
		note.addNoteToList(linkNote2);
		JsonHelper jsonHelper = new JsonHelper("workbook.json");
		jsonHelper.saveWorkBook(workbook);
		
		
      
		
		
              
	}
}
