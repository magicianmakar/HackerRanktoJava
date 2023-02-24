package mytest;

import java.util.*;

public class Solver5 {

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
			a.addAll(new ArrayList<>(Arrays.asList(6 , 13 , 20 , 27 , 7 , 14 , 21 , 28)));
			HashSet<Integer> unique = new HashSet(a);
			System.out.println(unique.size());
		}
	}

}
