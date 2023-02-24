package mytest;

import java.util.*;

public class Solver9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int n = read.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i = 0 ; i < n ; i++ ) {
				a.add(read.nextInt());
			}
			int cur = a.get(0) , cnt = 1;
			for(int i = 0 ; i < n ; i++ ) {
				if(a.get(i) != cur) {
					cur = a.get(i) ; cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
