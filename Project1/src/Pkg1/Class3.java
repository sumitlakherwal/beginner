package Pkg1;

public class Class3 {
	
	public int sub(int a, int b){
		int c;
		c=a-b;
		return c;
	}
	public int sum(int a, int b){
        int c;
        c=a+b;
        return c;
	}
	public int mul(int a, int b) {
		int c;
		c=a*b;
		return c;
	}
	public void div(int a, int b) {
		int c;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Class3 obj=new Class3();
		int sub=obj.sub(10, 2);
		int sum=obj.sum(sub, 2);
		int mul=obj.mul(sum, 2);
		int sub1=obj.sub(mul, 2);
		obj.div(sub1, 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
