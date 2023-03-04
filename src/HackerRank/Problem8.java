package HackerRank;

import java.util.*;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		List<List<Integer>> arr = new ArrayList<>();
		for(int icase = 0 ; icase < n ; icase++ ) {
			int k = read.nextInt();
			List<Integer> arrRow = new ArrayList<>();
			for(int i = 0 ; i < k ; i++ ) {
				arrRow.add(read.nextInt());
			}
			arr.add(arrRow);
		}
		int q = read.nextInt();
		while(q-->0) {
			int r = read.nextInt() , c = read.nextInt();
			r-- ; c--;
			if( r >= n || arr.get(r).size() <= c) {
				System.out.println("ERROR!");continue;
			}
			System.out.println(arr.get(r).get(c));
		}
	}
}
