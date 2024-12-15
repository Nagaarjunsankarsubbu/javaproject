package basicprgs1;

import Sample.Example;

public class Sample {
	
	/*
	 * public static int add(int i, int j) { return i+j; }
	 * 
	 * String returnMsg(String name) { return name; }
	 * 
	 * public String validateOddOrEven(int num) { if(num%2 == 0) { return
	 * num+" is Even Number"; } else { return num+" is Odd Number"; } }
	 * 
	 * public static void factorial(int num) { int x = 1; for(int i=1; i<=num; i++)
	 * { x=x*i; } System.out.println("factorial = "+x); }
	 */
	
	public static void main(String args[]) {
		System.out.println("Hi");
		
		/*
		 * Sample obj =new Sample(); //Instance/ Object Creation
		 * 
		 * int i = add(10, 15); System.out.println("i = "+i);
		 * 
		 * System.out.println(obj.returnMsg("Hi Welcome"));
		 * System.out.println(obj.validateOddOrEven(15)); factorial(5);
		 */
		
			Example e = new Example();
			System.out.println(Example.add(23, 213));
		
	}

}
