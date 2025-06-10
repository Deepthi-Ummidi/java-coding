package mypackage;

import java.util.*;
import java.util.Set;

public class MyClass {

    public static void main(String[] args) {
		Set<String> s = new LinkedHashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int d=sc.nextInt();
		sc.nextLine();
		System.out.println("enter names");
		for(int i=0;i<d;i++)
		{
			String s1=sc.nextLine();
			s.add(s1);
		}
		System.out.println(" after removing");
		System.out.println(s);
		sc.close();
	}
   
}
