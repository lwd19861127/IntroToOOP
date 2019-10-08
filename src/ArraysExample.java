public class ArraysExample {
	public static void main (String[] args) {
		// 1.array-literal (initialization)
		int[] arr1 = {1, 2, 3, 4, 5};
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
		int[] arr2 = new int[10];
		for(int e: arr2) {
			System.out.println(e); //10 zeros
		}
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 10;
		}
		
		//print the address
		System.out.println(arr2)
	}
}