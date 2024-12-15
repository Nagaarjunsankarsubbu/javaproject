package basicprgs1;

public class StringExp {

	public static void main(String args[]) {
		String name = "Raj";
		String name1 = "Raj";
		String name2 = new String("Raj");
		
		System.out.println(name == name1);
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		String str = "Hi Welcome to Java programming";
		//			  0123456789
			System.out.println(str.charAt(0));
			System.out.println(str.indexOf("H"));
			System.out.println(str.endsWith("g"));
			System.out.println(str.startsWith("W"));
			System.out.println(str.toUpperCase());
			System.out.println(str.toLowerCase());
			System.out.println(str.length());
			System.out.println(str.contains("to"));
			System.out.println(str.substring(11));
			System.out.println(str.substring(4, 15));
			System.out.println(str.replace(" ", "#"));
	}
	
}
