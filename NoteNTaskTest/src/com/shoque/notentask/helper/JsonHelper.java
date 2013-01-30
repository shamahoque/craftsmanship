package com.shoque.notentask.helper;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.shoque.notentask.model.WorkBook;

public class JsonHelper {
	private String fileName;
	private String json;
	public JsonHelper(String fileName) {
		this.fileName = fileName;
	}
	private void writer(String json) {
		try {
			FileOutputStream fos =  new FileOutputStream(fileName);
			fos.write(json.getBytes());
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private String reader() {
		FileInputStream in;
		StringBuffer fileContent = new StringBuffer();
		try {
			in = new FileInputStream(fileName);
			InputStreamReader inputStreamReader = new InputStreamReader(in);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				fileContent.append(line);
			}

		} catch (FileNotFoundException e) {
		} catch (Exception e) {
			e.printStackTrace();
		}

		return new String(fileContent);

	}
	public WorkBook getWorkBook(){
		WorkBook workBook;
		String json = reader();
		Gson gson = new Gson();
		workBook = gson.fromJson(json, WorkBook.class);
		
		return workBook;
		
	}
	
	public void saveWorkBook(WorkBook workbook) {
		Gson gson = new Gson();
		String json = gson.toJson(workbook);
		System.out.println("JSON Test" + json);
		writer(json);
	}
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	
	


}

