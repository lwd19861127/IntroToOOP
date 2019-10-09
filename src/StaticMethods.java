public class StaticMethods {
	// method prototype, header
	public static void printName(String name) {
		// public: means this method can be called from outside of this class.
		// static: means we can call this method without careating an object.
		// void: void means empty, -> no return value
		// printName: method name
		// String name: a parameter (Type paramName, , , , )
		System.out.println("Hello, " + name);
	}
	
	// non-static (instance method)
	// we need to create an object to call this method
	public void printCity(String city) {
		System.out.println("Hello, " + city);
	}
	
	// pass by value type (primitives type)
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	// pass by reference (int[] -> reference)
	public static void changeFirst(int[] arr) {
		arr[0] = 100; // modifies the original array
	}
	
	public static void changeFirst2(int[] arr) {
		int[] arr1 = {100, 2, 3};
		// we are assigning a new arr1's address to the local variable
		arr = arr1; // won't modify the original arr
	}
	
	public static int addTwo(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		printName("Vancouver");
		StaticMethods a = new StatciMethods();
		a.printCity("Victory");
		
		int x = 10;
		int y = 20;
		swap(x, y); // pass value
		System.out.println("x = " + x); // 10
		System.out.println("y = " + y); // 20
		
		int[] arr = {1, 2, 3};
		changeFirst(arr); // pass address
		System.out.println(Array.toString(arr)); // 100, 2, 3
		
		int[] array = {1, 2, 3};
		changeFirst2(array); // change addres in the method, original array does'nt cheange
		System.out println(Array.toString(array)); // 1, 2, 3
		
		System.out.println("x + y = " + addTwo(x + y));
		
	}
}