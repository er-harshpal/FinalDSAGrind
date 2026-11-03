package Recursion;

public class MultipleRecursion {
	// Fibonnaci Using the Recursion
	// f(n) f(n-1) f(n-2)
		public static void main(String[] args){
			int n = 10;
			System.out.println(Calc(n));
		}

		static int Calc(int n){
			if(n == 0){
				return 0;
			}
			if(n == 1){
				return 1;
			}
			return Calc(n-1) + Calc(n-2);
		}
	}

