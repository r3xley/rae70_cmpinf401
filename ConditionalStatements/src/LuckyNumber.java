

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LuckyNumber {
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> entrees = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName); 
			BufferedReader br = new BufferedReader(fr); 
			String food;
			while((food = br.readLine())!= null) {
				String[] EntreeList = food.split("@@");
				Entree entree1 = new Entree(EntreeList[0],EntreeList[1],Integer.parseInt(EntreeList[2]));
				entrees.add(entree1);
			}
		}}