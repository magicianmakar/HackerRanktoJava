package HackerRank;

import java.util.*;


public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();read.nextLine();
		Map<String , Integer> mp = new HashMap<String , Integer>();
		for(int i = 0 ; i < n ; i++ ) {
			String name = read.nextLine();
			int phonenumber = read.nextInt();read.nextLine();
			mp.put(name, phonenumber);
		}
		while(read.hasNext()) {
			String name = read.nextLine();
			if(mp.containsKey(name)) {
				System.out.println(name+"="+mp.get(name));
			}else System.out.println("Not found");
		}
		read.close();
	}
}
