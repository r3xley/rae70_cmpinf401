package rae70_assignment1;
import javax.swing.JOptionPane;
public class Lab2_Problem2 {

	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("Enter radius: ");
		double convert = Double.parseDouble(r);
			double perimeter = (2 * Math.PI * convert);//calculate the perimeter and the area 
			double area = (Math.PI * Math.sqrt(convert));
		JOptionPane.showMessageDialog( null , "The circle with the radius " + convert + " has the area of " + area + " and a perimeter of " + perimeter);

	}

}
