package Recursion;

public class BasicRecursion {
	// Write a Recursion function
// Recursion Tree
// Print Name 5 times
// Print linearly from 1 to N
// Print from 1 to 50
// Print Linearly from 1 to N but with backtrack
// Print n to 1  by backtrack
		public static void main( String[] args){
			int n = 5;
			// to print - 3 2 1
			meth(n);
		}
		public static int meth(int n){
			if(n < 1){
				return 0;
			}
			System.out.println(n);
			n = n -1;
			meth(n);
			return n;
		}
	}
