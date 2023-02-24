package StringProblem;

import java.util.*;

public class Problem3 {

	static boolean isVowel(char c) {
		if("aeiou".indexOf(c) != -1) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		while(t-->0)
		{
    		String a = read.next();
    		// Update your code below to solve this problem
            int n = a.length();
            for(int i = 0 ; i < n ; i++ ){
                System.out.print((char)((25 - a.charAt(i) + 'a') + 'a'));
            }
            System.out.println();

		}
	}

}
