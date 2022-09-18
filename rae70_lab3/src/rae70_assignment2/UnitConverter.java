package rae70_assignment2;
import javax.swing.JOptionPane;
public class UnitConverter {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input distance OR weight amount: ");
		int iOfSpace = input.indexOf(" ");
		String number  = input.substring(0, iOfSpace);
		double numerical = Double.parseDouble(number);
		String units = input.substring(iOfSpace + 1,input.length());
		double result = 0;
		
		
		if(units.equals("cm") || units.equals("in")) {
			if (units.equals("cm")) {
				double convertin = numerical / 2.54;
				result = convertin;
				units = "in";
			}else {
				double convertcm = numerical * 2.54;
				result = convertcm;
				units = "cm";
			}
		}
		else if(units.equals("oz") || units.equals("gm")) {
			if(units.equals("oz")) {
				double convertgm = numerical * 28.35;
				result = convertgm;
				units = "oz";
			}else {
				double convertoz = numerical / 28.35;
				result = convertoz;
				units = "gm";
			}
		}
		else if(units.equals("m") || units.equals("yd")) {
			if(units.equals("m")) {
				double convertm = numerical * 1.094;
				result = convertm;
				units = "yd";
			}else {
				double convertyd = numerical / 1.094;
				result = convertyd;
				units = "m";
			}
	    }
		else if(units.equals("lb") || units.equals("kg")) {
			if(units.equals("lb")) {
				double convertlb = numerical / 2.205;
				result = convertlb;
				units = "kg";
			}else {
				double convertkg = numerical * 2.205;
				result = convertkg;
				units = "lb";
			}
		
		}
		JOptionPane.showMessageDialog(null, input + " = " + result + " " + units);
	}

}
