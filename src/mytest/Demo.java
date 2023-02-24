package mytest;
import java.io.*;
import java.util.Scanner;

import java.util.*;

public class Demo {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        int ret = 0;
        for(int i = 0 ; i < n ; i++ ) {
        	a[i] = scan.nextInt();
        }
        for(int i = 0 ; i < m ; i++ ) {
        	b[i] = scan.nextInt();
        	ret += a[b[i]-1];
        }
        System.out.println(ret);
    }
}
