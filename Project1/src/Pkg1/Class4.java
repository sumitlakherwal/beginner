package Pkg1;

public class Class4 {
	public Class4() 
	{
		this(1, 2, 3);
		System.out.println("Default");
	}
	
	public Class4(int a) {
		this();
		System.out.println("One Parameterized");
		}
	
	public Class4(int a, int b) {
		this(1, 2, 3, 4);
		System.out.println("Two Parameterized");
		}
	
	public Class4(int a, int b, int c) {
		System.out.println("Three Parameterized");
	}
	
	public Class4(int a, int b, int c, int d) {
		this(1);
		System.out.println("Four Parameterized");
	}

 public static void main(String[] args) {
	Class4 obj=new Class4(1, 2);
}
	
}
