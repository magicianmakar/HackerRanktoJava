package mytest;

import java.util.*;

public class Solver7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int N = read.nextInt() , K = read.nextInt();
			int ans = -1;
			for(int i = 0 ; i < N ; i++ ) {
				int val = read.nextInt();
				if(val < K) ans = i;
			}
			System.out.println(ans+1);
		}
	}

}
