package rae70_MenuManager;
import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;

public class FileManager {
	//public ArrayList<String> readEntrees(String fileName) {
		//ArrayList <String> entree = new ArrayList<String>();
		try {
		    FileReader fr = new FileReader("data/entree.txt"); 
		    BufferedReader br = new BufferedReader(fr); 
		    String line = br.readLine();
		    System.out.println(line);
		    br.close();
		    fr.close();
		} catch (Exception e) {
		    System.out.println(e.getMessage());
		}

		return entree;
		
		
	}
	
}
 