package HackerRank;

import java.util.*;
import java.io.*;

interface BaseI{void method();}

class BaseC{
	public void method() {
		System.out.println("Inside BaseC::method");
	}
}

public class Test3 extends BaseC implements BaseI{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Test3()).method();
		try {
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x+b+d);
		}
		catch(NumberFormatException e){
			System.out.println("bad number.");
		}
	}

}
