package rae70_lab10;

public class Recursion {
	static int sumOfDigits(int n)
	{
		int sum = n % 10;
		if (n == 0)
			return 0;
		return sum + ( sumOfDigits(n / 10));
	}
//task 1

	public static void printArrayElements(int a[],int index)
	{
		if(index != -1) {
			printArrayElements(a, index -1);
			System.out.println(a[index]);

		}
	}
//task 2
	
// task 3 cover in class	

	public static void main(String[] args) {
		int a[] = {1,5,7};
		printArrayElements(a,2);
		
		System.out.print(sumOfDigits(12345));
		


	}
}