package StringProblem;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			String a = read.next();String b = read.next();
			int A = 0 , B = 0 , l = 0;
			int n = a.length();
			for(int i = 0 ; i < n ; i++ ) {
				if(a.charAt(i) == '1') A++;
				if(b.charAt(i) == '1') B++;
				if(a.charAt(i) == b.charAt(i)) l++;
			}
			System.out.println(A + " " + B + " " + l);
		}
	}

}
