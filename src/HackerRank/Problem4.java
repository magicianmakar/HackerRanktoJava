package HackerRank;

import java.util.*;
import java.io.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
		int cnt = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + year-1;
		int [] a = {0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31};
		for(int i = 1 ; i < month ; i++ ) cnt += a[i];
		cnt += day;
		if((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) && month > 2) cnt++;
		String [] Day = {"SUNDAY" , "MONDAY" , "TUESDAY" , "WEDNESDAY" , "THURSDAY" , "FRIDAY" , "SATURDAY"};
		return Day[cnt%7];
    }

}

public class Problem4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUT_PATH")));
		String [] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
		int month = Integer.parseInt(firstMultipleInput[0]);
		int day = Integer.parseInt(firstMultipleInput[1]);
		int year = Integer.parseInt(firstMultipleInput[2]);
		String res = Result.findDay(month, day, year);
		System.out.println(res);
//		bufferedWriter.write(res);
//		bufferedWriter.newLine();
		bufferedReader.close();
//		bufferedWriter.close();
	}

}
