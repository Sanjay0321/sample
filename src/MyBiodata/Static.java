package MyBiodata;

public class Static {
	public static void type1() {
		System.out.println("This is static method1 ");
	}
	public  void type2() {
		type1();
		System.out.println("This is static method2 ");
	}
public static void main(String[] args) {
	
	Static a=new Static();
	a.type2();
	
}
}
