package Pkg1;


public class Class5 {
	public void Class() 
	{
	
		System.out.println("Default");
	}
	
	public void Class(int a) {
	
		System.out.println("One Parameterized");
		}
	
	public void Class(int a, int b) {
		this.Class(1, 2, 3);
		this.Class();
		this.Class(1);
		this.Class(1, 2, 3, 4);
		System.out.println("Two Parameterized");
		}
	
	public void Class(int a, int b, int c) {
		System.out.println("Three Parameterized");
	}
	
	public void Class(int a, int b, int c, int d) {

		System.out.println("Four Parameterized");
	}

 public static void main(String[] args) {
	Class5 obj=new Class5();
	obj.Class(2, 5);
}
	
}

