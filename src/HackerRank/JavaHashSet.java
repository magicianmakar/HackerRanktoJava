package HackerRank;

import java.util.*;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner read = new Scanner(System.in);
//		int n = read.nextInt();read.nextLine();
//		HashSet<String> hashSet = new HashSet<String>();
//		for(int i = 0 ; i < n ; i++ ) {
//			String s = read.nextLine();
//			hashSet.add(s);
//			System.out.println(hashSet.size());
//		}
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
        String A1 = "" , B1 = "";
        A1 += A.substring(0, 1).toUpperCase();
        A1 += A.substring(1);
        B1 += B.substring(0, 1).toUpperCase();
        B1 += B.substring(1);
        System.out.println(A1 + " " + B1);
	}

}
