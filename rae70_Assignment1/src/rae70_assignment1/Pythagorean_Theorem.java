package rae70_assignment1;

import javax.swing.JOptionPane;

public class Pythagorean_Theorem {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Enter side a: ");
		String b = JOptionPane.showInputDialog("Enter side b: ");
		//Messages that appear to user - #step 1
			double side1 = Integer.parseInt(a);
			double  side2 = Integer.parseInt(b);
			//^^change string to numbers #step 2
			double pthag = Math.sqrt(Math.pow(side1,2) + Math.pow(side2,2));//Take the sqroot of a^2 + b^2 #step 3
			double x = (pthag) * 100;
			int r = (int)Math.round(x);
			x = r/100.0;//truncate ##LAST STEP (14-17)
			JOptionPane.showMessageDialog( null , "The hypotenuse is " + x);//Print full message #step 4
		
		

	}

}
