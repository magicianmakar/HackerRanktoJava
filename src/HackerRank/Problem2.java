package HackerRank;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		while(t-->0) {
			try {
				long val = read.nextLong();
				System.out.println(val+" can be fitted in:");
				if(val >= -128 && val <= 127) System.out.println("* byte");
				if(val >= -32768 && val <= 32767) System.out.println("* short");
				if(val >= -2147483648 && val < 2147483648L) System.out.println("* int");
				if(val >= -9223372036854775808L && val <= 9223372036854775807L) {
					System.out.println("* long");
				}
			}catch(Exception e){
				System.out.println(read.next() + " can't be fitted anywhere.");
			}
		}
	}

}
