package mytest;

import java.util.*;

public class Solver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-->0) {
			int N = scan.nextInt() , K = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			int pos = 0 , neg = 0 , divk = 0;
			for(int i = 0 ; i < N ; i++ ) {
				int n = scan.nextInt();
				if(n > 0) pos++;
				else if(n < 0) neg++;
				if(n % K == 0) divk++;
			}
			System.out.println(pos + " " + neg + " " + divk);
		}
	}
}
