package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
	static boolean intArraySorted(int[] a) {
		int n = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < n) {
				return false;
			}
			n = a[i];
		}
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] a) {
		double n = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < n) {
				return false;
			}
			n = a[i];
		}
		return true;
	}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
	static boolean charArraySorted(char[] a) {
		char n = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] < n) {
				return false;
			}
			n = a[i];
		}
		return true;
	}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] a) {
		String n = "";
		for(int i = 0; i < a.length; i++) {
			if(a[i].compareTo(n) < 0) {
				return false;
			}
			n = a[i];
		}
		return true;
	}

}
