package mytest;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc--> 0) {
			int N = scan.nextInt() , D = scan.nextInt() , K = scan.nextInt();
			int d = gcd(N , D);
			int n = N / d;K--;
			long ans = (long) (K % n) * D % N + (K / n);
			
			System.out.println(ans);
		}
	}
	
	static int gcd(int a , int b) {
		if(b == 0) return a;
		else return gcd(b , a % b);
	}
}
