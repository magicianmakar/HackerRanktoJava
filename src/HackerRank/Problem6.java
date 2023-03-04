package HackerRank;

import java.util.*;
import java.io.*;

public class Problem6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<List<Integer>> arr = new ArrayList<>();
		for(int i = 0 ; i < 6 ; i++ ) {
			String [] arrRowTempItems = bufferedReader.readLine().replace("\\s+$", "").split(" ");
			List<Integer> arrRowItems = new ArrayList<>();
			for(int j = 0 ; j < 6 ; j++ ) {
				arrRowItems.add(Integer.parseInt(arrRowTempItems[j]));
			}
			arr.add(arrRowItems);
		}
		int ans = 0;
		for(int i = 0 ; i < 4 ; i++ ) {
			for(int j = 0 ; j < 4 ; j++ ) {
				int sum = 0;
				for(int k = 0 ; k < 3 ; k++ ) {
					for(int l = 0 ; l < 3 ; l++ ) {
						sum += arr.get(i+k).get(j+l);
					}
				}
				sum -= arr.get(i+1).get(j) + arr.get(i+1).get(j+2);
				ans = Math.max(ans, sum);
			}
		}
		System.out.println(ans);
		bufferedReader.close();
	}

}
