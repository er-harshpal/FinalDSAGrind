package Recursion;
// Time Complexity = O(N)
// Space Complexity = O(N)
public class FactorialProblem {
	public static void main(String[] args){
		int n = 10;
		System.out.println(fact(n));
	}

	static int fact(int n){
		if(n == 0) {
			return 1;
		}
		return n * fact(n -1);
	}
}
