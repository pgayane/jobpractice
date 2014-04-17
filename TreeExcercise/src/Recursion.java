import java.util.ArrayList;
import java.util.Arrays;


public class Recursion {

	public static int recSum(int[] a){
		
		int total = 0;
		if (a.length == 1) {
			total = a[0];
		}
		else if (a.length > 1) {
			int[] copyA = Arrays.copyOfRange(a, 1, a.length);
			total = a[0] + recSum(copyA);
		} 
		
		return total;
	}
	
	public static int loopSum(int b) {
		int total = 0;
		while (b >= 1) {
			int c = b%10;
			b = b/10;
			total += c;
		}
		return total;
	}
	
	public static int recIntSum(int b) {
		int total = 0;
		if (b>=1) {
			int c = b%10;
			b=b/10;
			total = c + recIntSum(b);
		}
		return total;
	}
	
	public static int childStairs(int n) {
		int possibilities = 0;
		if ( n > 0) {
			if (n == 1) {possibilities = 1;}
			else if (n == 2) {possibilities = 2;}
			else if (n == 3) {possibilities = 4;}
			else if (n > 3) {
				System.out.println("calling recursion for " + n);
				int oneStep = childStairs(n-1);
				int twoStep = childStairs(n-2);
				int threeStep = childStairs(n-3);
				possibilities = oneStep + twoStep + threeStep; 
			}
		}
		System.out.println("n is " + n);
		System.out.println("     and possib is " + possibilities);
		return possibilities;
	}
	
	public static void main(String[] args){
		int[] a = {2,3,3,4};
		int b = 1345;
		int n = 20;
		
		System.out.println(loopSum(b));
		System.out.println(recIntSum(b));
		
		childStairs(5);
		//System.out.println(recSum(a));
	}
}
