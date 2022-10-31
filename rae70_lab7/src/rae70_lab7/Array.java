package rae70_lab7;
import javax.swing.JOptionPane;
public class Array {

	public static double max(double [] data) {
		int i;
		double max_value = data[0];
		for (i = 1; i < data.length; i++)
            if (data[i] > max_value)
                max_value = data[i];
        return max_value;
	}
	public static double min(double [] data) {
		int i;
		double min_value = data[0];
		for (i = 1; i < data.length; i++)
            if (data[i] < min_value)
                min_value = data[i];
        return min_value;
	}
	public static double sum(double [] data) {
		int sum = 0;
		for (int i = 0; i < data.length; i++)
	        sum += data[i];
	 
	    return sum;
	}
	public static double ave(double [] data) {
	    sum(data);
		double avg  = sum(data) / data.length;
	    return avg;
	}
	
	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How many items will be entered?");
	int num = Integer.parseInt(input);
	double[] array = new double[num];
	for(int i = 0; i< num; i++) {
		array[i] = Math.floor(Math.random()*101);
		//System.out.println(array[i]);
	}
	
	 System.out.println("max value: " + max(array));
	 System.out.println("min value: " + min(array));
	 System.out.println("sum of values: " + sum(array));
	 System.out.println("avg of values: " + ave(array));

	}

}
