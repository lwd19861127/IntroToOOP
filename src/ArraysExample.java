import java.util.Arrays;

public class ArraysExample {
	public static void main (String[] args) {
		// 1.array-literal (initialization) (Array length is fixed) -stack (not data segment)
		int[] arr1 = {1, 2, 3, 4, 5};
		
		int[] arr2 = {1, 2, 3, 4, 5}; // creating a new array stack
		arr2[0] = 6; // arr1's content won't change
		
		arr2 = arr1; // arr2 point to the arr1 content
		arr2[0] = 6; // arr1's content will change

		// the length(size) of array
		System.out.println(arr1.length);
		
		// access elements in array
		System.out.println(arr1[0]);
		// access the last element in array
		System.out.println(arr1[arr1.length-1]);
		
		// for-loop
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// change elements
		arr1[0] = 7;
		
		// for-each loop
		for(int elem: arr1) {
			System.out.println(elem);
		}
		
		// 2.create an array with the size
		// create a new arr obj with size 10.
		// by default, it stores 10 zeros.
		int[] arr3 = new int[10];
		for(int e: arr3) {
			System.out.println(e); //10 zeros
		}
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 30;
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = i * 10;
		}
		
		// print the address
		System.out.println(arr3);
		
		// print the elements
		System.out.println(Arrays.toString(arr3));
		
		String[] countries = {"Canada", "China"};
		countries[0] = "USA";
		
		for(String country: countries) {
			System.out.println(country);
		}
	}
}