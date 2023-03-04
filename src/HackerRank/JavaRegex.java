package HackerRank;

import java.util.*;
import java.util.regex.*;

public class JavaRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
			try {
				Pattern p = Pattern.compile(pattern);
			}catch(PatternSyntaxException e) {
				System.out.println(e);
				System.out.println("Invalid");
			}
		}
	}
}
