package mytest;

import java.util.*;

public class Solver8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int n = read.nextInt() ;
			int [] a = new int[n];
			for(int i = 0 ; i < n ; i++ ) {
				a[i] = read.nextInt();
			}
			int val = Integer.MIN_VALUE;
			for(int i = 0 ; i < n ; i++ ) {
				if(val < (a[i] + a[(i+1)%n])) val = a[i] + a[(i+1)%n];
			}
			System.out.println(val);
		}
	}
}
