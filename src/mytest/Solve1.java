package mytest;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solve1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-->0) {
			int N = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for(int i = 1 ; i <= N ; i++ ) a.add(i);
			System.out.println(a);
			Collections.reverse(a);
			System.out.println(a);
		} 
	}

}
