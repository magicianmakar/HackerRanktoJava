package StringProblem;

import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc--> 0) {
			String s = read.next();
			System.out.println(s);
			StringBuffer str = new StringBuffer(s);
			str.reverse();
			System.out.println(str);
		}
	}

}
