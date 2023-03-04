package HackerRank;

import java.util.*;

class Student{
	private double cgpa;
	private String fname;
	private int id;
	
	public Student(int id , String fname , double cgpa) {
		super();
		this.id = id;
		this.fname =fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getString() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}


public class JavaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();read.nextLine();
		List<Student> studentList = new Student(id , fname , cgpa);
		while(n-->0) {
			int id = read.nextInt();
			String fname = read.next();
			double cgpa = read.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
		}
	}

}
