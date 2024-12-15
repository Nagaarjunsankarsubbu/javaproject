package Sample;

public class Example {

	public static int add(int i, int j) {
		return i+j;
	}
	
	String returnMsg(String name) {
		return name;
	}
	
	public String validateOddOrEven(int num) {
		if(num%2 == 0) {
			return num+" is Even Number";
		} else {
			return num+" is Odd Number";
		}
	}
	
	public static void factorial(int num) {
		int x = 1;
		for(int i=1; i<=num; i++) {
			x=x*i;
		}
		System.out.println("factorial = "+x);
	}	
	
}