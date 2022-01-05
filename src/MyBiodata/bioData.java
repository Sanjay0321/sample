package MyBiodata;

import java.util.Scanner;

public class bioData {
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		
		System.out.println("Emp ID :");
		int nextInt = ab.nextInt();
		System.out.println("Emp Name :");
		String next = ab.next();
		System.out.println("Emp Email :");
		String next2 = ab.next();
		System.out.println("Emp Phone Number :");
		long nextLong = ab.nextLong();
		System.out.println("Emp Salary :");
		double nextDouble = ab.nextDouble();
		System.out.println("Gender :");
		char charAt = ab.next().charAt(0);
		System.out.println("City :");
		String next3 = ab.next();
		
	}

}
