package mytest;

import java.util.*;

public class Solver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tc = scan.nextInt();
		while(tc-->0) {
			int n = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for(int i = 0 ; i < n ; i++ ) {
				a.add(scan.nextInt());
			}
			HashSet<Integer> unique = new HashSet<Integer>(a);
			ArrayList<Integer> uniquesort = new ArrayList<Integer>(unique);
			ArrayList<Integer> freq = new ArrayList<Integer>();
			int val = 0;
			for(int i = 0 , sz =uniquesort.size() ; i < sz ; i++ ) {
				freq.add(Collections.frequency(a, uniquesort.get(i)));
			}
			for(int i = 0 ; i < freq.size() ; i++ ) {
				if(val < freq.get(i)) val = freq.get(i);
			}
			System.out.println(n-val);
		}
	}
}
