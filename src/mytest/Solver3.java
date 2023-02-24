package mytest;

import java.util.*;
import java.math.*;

public class Solver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-->0) {
			int N = scan.nextInt();
			int Max = Integer.MIN_VALUE , ans_id = 0;
			for(int i= 0 ; i < N ; i++ ) {
				int val = scan.nextInt();
				if(val >= Max) {
					Max = val ; ans_id = i; 
				}
			}
			System.out.println(Max + " " + ans_id);
		}
	}

}
