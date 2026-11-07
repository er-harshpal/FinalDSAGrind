package Array;
import java.util.*;
// Rotate ArrayLeft by D  Places
public class ArrayRotation {
	public static void main(String[] args){
		int[] arr = { 2,7,4,9,5,3,0,5,2,6,3,2};
		int len = arr.length;
		System.out.println(arr);
	}
	static int[] soln(int[] arr, int len){
		// Rotation by d
		int d = 4;
		d = len % d;
		//Temp Array
		int[] temp = Arrays.copyOfRange(arr, 0, d);
		//Shifting
		for(int i=d; i < len; i++){
			arr[i-d] = arr[i];
		}
		int k= 0;
		for(int j = len -d; j<len; j++){
			arr[j] = temp[k];
			k++;
		}
		return arr;
	}
}
