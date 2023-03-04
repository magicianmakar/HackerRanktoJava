package HackerRank;

import java.util.*;


public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++ ) {
			arr.add(read.nextInt());
		}
		int q = read.nextInt();
		while( q-- > 0) {
			String s = read.nextLine();
			if(s == "Insert") {
				int which = read.nextInt() , val = read.nextInt();
				arr.add(which, val);
			}else {
				int which = read.nextInt();
				arr.remove(which);
			}
		}
		for(int i = 0 ;  i < arr.size() ; i++ ) {
			System.out.println(arr.get(i).toString() + " ");
		}
		System.out.println();
	}

}
