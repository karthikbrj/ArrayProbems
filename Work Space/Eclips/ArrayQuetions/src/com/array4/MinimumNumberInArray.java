package com.array4;

public class MinimumNumberInArray {
	public static int findMinimumNumber(int arr[]) {
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}

}
