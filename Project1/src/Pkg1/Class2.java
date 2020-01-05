package Pkg1;

public class Class2 {

   public int sum(int a, int b){
	 int c;
	 c=a+b;
	 return c;
   }
	
   public int sub(int a, int b){
	  int c;
	  c=a-b;
	  return c;
	}
	
   public int mul(int a, int b){
	  int c;
	  c=a*b;
	  return c;
	}
	
   public int div(int a, int b){
		int c;
		c=a/b;
		return c;
	}
	
   public static void main(String[] args) {
		Class2 obj=new Class2();
		int sum1=obj.sum(10, 2);
		int sub=obj.sub(sum1, 2);
		int sum2=obj.sum(sub, 2);
		int mul=obj.mul(sum2, 2);
		int div=obj.div(mul, 2);
		System.out.println(div);
		}
}
