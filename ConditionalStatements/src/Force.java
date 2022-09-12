
public class Force {

	public static void main(String[] args) {
		
		double result = force(10,9.8);
		System.out.print(result);
		
		double result1 = force(120,9.8);
		System.out.print(result);
	}
	public static double force(double mass, double acc) {
		double forceCalc = mass * acc;
		
		return forceCalc;
	}
}
