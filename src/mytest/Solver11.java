package mytest;

import java.util.*;

public class Solver11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int N = read.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			a.add(0) ; b.add(0);
			for(int i = 0 ; i < N ; i++ ) {
				int val = read.nextInt();
				a.add(val);
			}
			for(int i = 0 ; i < N ; i++ ) {
				b.add(read.nextInt());
			}
			int ans = 0;
			for(int i = 1 ; i <= N ; i++ ) {
				if(a.get(i-1) + b.get(i) <= a.get(i)) ans++;
			}
			System.out.println(ans);
		}
	}
}
