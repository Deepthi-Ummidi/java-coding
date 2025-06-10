package mypackage;

import java.util.*;

public class Prob3 {
	public static void main(String arg[])
	{
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> m=new ArrayList<Integer>();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter size");
    	int d=sc.nextInt();
    	for(int i=0;i<d;i++)
    	{
    		int d1=sc.nextInt();
    		l.add(d1);
        }
    	System.out.println("original"+l);
    	for(int j=l.size()-1;j>=0;j--)
    	{
    		int a=l.get(j);
    		m.add(a);
    	}
    	System.out.println(m);
    	sc.close();
	}
}
