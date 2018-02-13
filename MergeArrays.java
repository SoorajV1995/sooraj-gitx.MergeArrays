package com.programming.challange;

public class MergeArrays {
	public static int[] mergingTwoarrays(int a[], int b[]) {
		int[] mergedSortedarray = new int[a.length+b.length];
		int i=0,k=0,j=0;
		
		while(i<a.length && j<b.length) {
			
			//to merge sorted arrays in ascending order
			//if current element of 1st array is smaller than the other add it to new array
			// else add element of other array to new array
			if(a[i]<b[j]) {
				mergedSortedarray[k] = a[i];
				i++;
			} else {
				mergedSortedarray[k] = b[j];
				j++;
			}
			k++;
		}
		//storing remaining elements
		while(i<a.length) {
			mergedSortedarray[k] = a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			mergedSortedarray[k] = b[j];
			j++;
			k++;
		}
		return mergedSortedarray;
	}

	public static void main(String[] args) {
		
		int[] arrayOne = {1,0,0,0,0,0};
		int[] arrayTwo = {1,0,0,0,0,0};
		
		int[] mergedArray = mergingTwoarrays(arrayOne, arrayTwo);
		
		System.out.println("Array after merging:");
		System.out.print("[ ");
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(+mergedArray[i]+" ");
		}
		System.out.println("]");
	}

}
