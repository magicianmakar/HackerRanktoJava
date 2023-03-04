package HackerRank;

import java.util.*;

public class Problem9 {

	
	public static boolean canWin(int leap , int n , int []game) {
		Queue<Integer> que = new LinkedList<>();
		while(!que.isEmpty()) que.remove();
		boolean []vis = new boolean [n];
		for(int i = 0 ;  i < n ; i++ ) vis[i] = false;
		que.add(0);vis[0] = true;
		
		while(!que.isEmpty()) {
			int u = que.peek();que.remove();
			if(u + 1 >= n || u + leap >= n) return true;
			if(u-1 >= 0 && vis[u-1] == false && game[u-1] == 0) {
				vis[u-1] = true ; que.add(u-1);
			}
			if(u+1 < n && vis[u+1] == false && game[u+1] == 0) {
				vis[u+1] = true ; que.add(u+1);
			}
			if(u+leap < n && vis[u+leap] == true && game[u+leap] == 0) {
				vis[u + leap] = true;que.add(u+leap);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int tc = read.nextInt();
		while(tc-->0) {
			int n = read.nextInt() , leap = read.nextInt();
			int []game = new int[n];
			for(int i = 0 ; i < n ; i++ ) {
				game[i] = read.nextInt();
			}
			System.out.println( (canWin(leap, n , game)) ? "YES" : "NO" );
		}
		read.close();
	}

}
