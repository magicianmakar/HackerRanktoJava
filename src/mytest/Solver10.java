package mytest;

import java.util.*;

public class Solver10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int N = read.nextInt();
			int Alice = 0 , Bob = 0;
			int AMax = 0 , BMax = 0;
			for(int i = 0 ; i < N ; i++ ) {
				int val = read.nextInt();
				AMax = Math.max(val, AMax);
				Alice += val;
			}
			for(int i = 0 ; i < N ; i++ ) {
				int val = read.nextInt();
				BMax = Math.max(val, BMax);
				Bob += val;
			}
			Alice -= AMax ; Bob -= BMax;
			System.out.println(Alice == Bob ? "Draw" : (Alice < Bob ? "Alice" : "Bob"));
		} 
	}

}
