package Array;

import java.util.*;

// Might have duplicates
// Use of Set
public class UnionOfSorted {
	public static void main(String[] args){
		Set<Integer> newSet = new HashSet<>();
		int[] arr = {2,56,4,8,5,3,43,8,5,3,8,4,5,8,53,7,5,54};
		int[] newArr = {2,4,7,34,7,854,3,2,56,89,6,34,3,677};
		System.out.println(sol(newSet, arr, newArr));
	}
	static Set sol(Set newSet, int[] arr, int[] newArr){
		for(int i=0; i<arr.length; i++){
			newSet.add(arr[i]);
		}
		for(int j=0; j<newArr.length; j++){
			newSet.add(newArr[j]);
		}
		return newSet;
	}
}

// It can also be solved using the two pointer