package basic;

import java.util.Arrays;
import java.util.Scanner;

public class AAArrayMain_Program {

	public int sumofArray(int[] arr) {
		int sum = 0;

		// for finding sum
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.print("sum of all the Elements are:-" + sum);

		return sum;
	}

	public void reverseArray(int[] arr) {
		int len = arr.length;
		System.out.println("reversed elements are:-");
		for (int i = len - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

	public int checkNumberisPresentornot(int k, int[] arr) {

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (k == arr[i]) {
				System.out.println("yes the number is present at " + i + "  position");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(k + " is not present in the arary...");
		}

		return k;
	}

	public void countofEvenoddinArray(int[] arr) {
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}

		}
		System.out.println("Count of even number in array is:-" + evencount);
		System.out.println("Count of odd numbers in array is:-" + oddcount);

	}

	public void sortingArraBubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}

			}
		}
		// System.out.println("sorted elements are:-"+Arrays.toString(arr));
		System.out.println("sorted elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AAArrayMain_Program a1 = new AAArrayMain_Program();
		System.out.print("Enter the size of the array...");
		int size = s.nextInt();

		int[] intarray = new int[size]; // integer array

		String[] sarray = new String[size]; // string Array

		// now adding the elemens inside an array

		System.out.print("ENter the elements of the array	");

		for (int i = 0; i < size; i++) {
			intarray[i] = s.nextInt();
		}

		System.out.println("Entered array elements are");

		for (int i = 0; i < intarray.length; i++) {
			System.out.print(intarray[i]);
			System.out.println();
		}

		// now from here you can call all the methods...

		// a1.sumofArray(intarray);
		// a1.reverseArray(intarray);
		// a1.checkNumberisPresentornot(7, intarray);
		// a1.countofEvenoddinArray(intarray);
		a1.sortingArraBubblesort(intarray);
	}

}
