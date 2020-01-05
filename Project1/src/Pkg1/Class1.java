package Pkg1;

public class Class1 {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int x;
		x=a-b;
		return x;
	}
	public void mul(int c, int x)
	{
	    int z;
	    z=c*x;
	    System.out.println(z);
	}
	public static void main(String[] args) {
		Class1 obj=new Class1();
		int a=obj.sum(20, 10);
		int b=obj.sub(20, 10);
		obj.mul(a, b);
		
	}		
	
}

