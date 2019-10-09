public class StringExample {
	public static void main(String[] args) {
		// String - A sequence of characters
		// (Reference Type)
		String name = "Derrick"; // string literal - data seg
		String name1 = "Derrick"; // string literal - data seg
		// == compares references(addresses)
		System.out.println(name == name1); // true: have same address
		
		String name2 = new String("Derrick"); // heap - data seg
		System.out.println(name == name2); // false: have diffrent address
		
		String name3 = new String("Derrick");
		System.out.println(nam2 == name3); // false: have diffrent address
		// always use .equals() to compare string objects!
		System.out.printle(name.equals(name3)); //ture: have same content
		
		// Get the length of string
		String coffee = "Starbucks";
		System.out.println(coffee.length());
		
		// Get the substring
		// In Python, coffee[0:4] -> "Star"
		System.out.println(coffee.substring(0, 4));
		
		// Get the index of a string t
		String t = "bucks";
		System.out.println(coffee.indexOf(t)); // 4
		
		// for-loop to print all characters in string
		for (int i = 0; i < coffee.length(); i++) {
			System.out.println(coffee.substring(i,i+1); // String
			System.out.println(coffee.charAt(i)); // char
		}
		
		// for-each loop to print all characters in string
		for(char ch: coffee.toCharArray()) {
			System.out.println(ch);
		}
	}
}