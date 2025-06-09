import java.util.*;

class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int f=0,f1=1;
	System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		System.out.print(f + " ");
		int next = f + f1;
            f = f1;
            f1 = next;
		
	}
 }
}