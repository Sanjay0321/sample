package MyBiodata;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("student ID :");
		int nextInt = a.nextInt();
		System.out.println("student Name :");
		String next = a.next();
		System.out.println("English mark :");
		byte english = a.nextByte();
		System.out.println("French mark :");
		byte french = a.nextByte();
		System.out.println("Math mark :");
		byte math = a.nextByte();
		System.out.println("Science mark :");
		byte science = a.nextByte();
		System.out.println("Social mark :");
		byte social = a.nextByte();
		
		int b=english+french+math+science+social;
		System.out.println("The total mark is :"+b);
		int c=b / 5;
		System.out.println("The average persentage is :"+ c+"%");
				
		
	}

}
