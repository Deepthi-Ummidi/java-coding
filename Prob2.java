package mypackage;

import java.util.*;

public class Prob2 {
	 public static void main(String[] args) {
	List<Integer>l =new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int d=sc.nextInt();
	for(int i=0;i<d;i++)
	{
		int d1=sc.nextInt();
		l.add(d1);
	}
	Collections.sort(l,Collections.reverseOrder());
	System.out.println(l);
	int s=l.size();
	System.out.println(l.get(s-(d-1)));	
	sc.close();
  }
}
