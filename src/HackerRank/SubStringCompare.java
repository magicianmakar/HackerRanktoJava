package HackerRank;

import java.util.*;

public class SubStringCompare {

//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "zzz";
//        String largest = "AAA";
//        
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//        int len = s.length();
//        for(int i = 0 ; i < len-2 ; i++ ){
//            if(smallest.compareTo(s.substring(i , i+3)) > 0 ){
//                smallest = s.substring(i , i+3);
//            }
//            if(largest.compareTo(s.substring(i , i+3)) < 0){
//                largest = s.substring(i , i+3);
//            }
//        }
//        return smallest + "\n" + largest;
    	
//    }


    public static void main(String[] args) {
    	Scanner read = new Scanner(System.in);
    	String s = read.nextLine();
    	String []a = s.split("[!,?._'@ ]");
    	int len = a.length;
    	System.out.println(len);
    	for(String i : a) {
    		if(!i.isEmpty())System.out.println(i);
    	}
    }
}