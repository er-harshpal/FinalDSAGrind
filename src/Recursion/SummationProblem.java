package Recursion;
// Sum of first N numbers
public class SummationProblem {
	public static void main(String[] args){
		int n = 10;
		System.out.println(summ(n));
	}

	static int summ(int n){
		if(n == 0) {
			return 0;
		}
		return n+ summ(n-1);
	}








//	public static void main(String[] args){
//		int n = 10;
//		int sum = 0;
//		System.out.println(summ(n, sum));
//	}
//
//	static int summ(int n, int sum){
//		if(n == 0) {
//			return sum;
//		}
//		return summ(n-1, sum + n);
//	}






//	public static void main(String[] args){
//		int n = 10;
//		int sum = 0;
//		System.out.println(summ(n, sum));
//	}
//
//	static int summ(int n, int sum){
//		if(n==0){
//			return sum;
//		}
//		sum = sum + n;
//		n = n-1;
//		return summ(n, sum);
//	}
}