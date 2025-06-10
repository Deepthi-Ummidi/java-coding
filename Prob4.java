package mypackage;
import java.util.*;
public class Prob4 {

		public static void main(String arg[])
		{
			List<Integer> l =new ArrayList<Integer>();
			List<Integer> m =new ArrayList<Integer>();
			Set<Integer> v =new LinkedHashSet<Integer>();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter 1st list size");
			int d=sc.nextInt();
			System.out.println("enter elements");
			for(int i=0;i<d;i++)
			{
				int t=sc.nextInt();
				l.add(t);
			}
			System.out.println("enter 2nd list  size");
			int d1=sc.nextInt();
			System.out.println("enter elements");

			for(int j=0;j<d1;j++)
			{
				int e=sc.nextInt();
				m.add(e);
			}
			Collections.sort(l);
			System.out.println("1st list"+l);
			Collections.sort(m);
			System.out.println("2nd list"+m);
			sc.close();
			for(int k=0;k<l.size();k++)
			{
				int a=l.get(k);
				v.add(a);
			}
			for(int k1=0;k1<m.size();k1++)
			{
				int a1=m.get(k1);
				v.add(a1);
			}
			List<Integer> m1 =new ArrayList<Integer>(v);
			Collections.sort(m1);
			System.out.println("final list"+m1);
		}
}
