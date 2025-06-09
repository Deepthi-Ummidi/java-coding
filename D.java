import java.util.*;
class D
{
	public static void main(String arg[])
	{
		int a,b,t;
		Scanner sc=new Scanner(System.in);
	        System.out.println("enter numbers");
		a=sc.nextInt();
		System.out.println("A value:"+a);
		b=sc.nextInt();
		System.out.println("B value:"+b);
		t=a;
		a=b;
		b=t;
		System.out.println("after swapping");

		System.out.println("A value:"+a);
		System.out.println("B value:"+b);

	}
}
		
		