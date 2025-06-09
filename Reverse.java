import java.util.*;

class Reverse {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");	
        StringBuilder s1 = new StringBuilder();
        String s = sc.next();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            s1.append(c);
        }

        System.out.println("Reversed string: " + s1.toString());
    }
}
