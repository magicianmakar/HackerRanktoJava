package HackerRank;

import java.util.*;

public class JavaStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		while(read.hasNext()) {
			String s = read.nextLine();
			Stack<Character> stc1 = new Stack<>();
			Stack<Character> stc2 = new Stack<>();
			Stack<Character> stc3 = new Stack<>();
			int len = s.length();
			int ok = 1;
			for(int i = 0 ; i < len ; i++ ) {
				if(s.charAt(i) == '{') {
					stc1.add('{');
				}else if(s.charAt(i) == '[') {
					stc2.add('[');
				}else if(s.charAt(i) == '(') {
					stc3.add('(');
				}else if(s.charAt(i) == '}') {
					if(stc1.isEmpty()) {
						ok = 0;break;
					}else {
						stc1.pop();
					}
				}else if(s.charAt(i) == ']') {
					if(stc2.isEmpty()) {
						ok = 0;break;
					}else {
						stc2.pop();
					}
				}else if(s.charAt(i) == ')') {
					if(stc3.isEmpty()) {
						ok = 0;break;
					}else {
						stc3.pop();
					}
				}
			}
			if(!stc1.isEmpty() || !stc2.isEmpty() || !stc3.isEmpty()) ok = 0;
			System.out.println(ok == 1 ? "true":"false");
		}
	}

}
