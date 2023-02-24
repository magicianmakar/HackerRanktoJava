package mytest;

import java.util.*;

public class Solver6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int n = read.nextInt();
			int total = 0 , Min = Integer.MAX_VALUE;
			for(int i = 0 ; i < n ; i++ ) {
				int val = read.nextInt();
				if(Min > val) Min = val;
				total += val;
			}
			System.out.println(total - Min);
		}
	}

}
