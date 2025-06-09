import java.util.*;

class AreaP {
    public static void main(String arg[]) {
        int perimeter, base, height, t1, t2, t3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and height of triangle:");
        base = sc.nextInt();
        height = sc.nextInt();

        System.out.println("Enter the three sides of the triangle:");
        t1 = sc.nextInt();
        t2 = sc.nextInt();
        t3 = sc.nextInt();

        float area = 0.5f * base * height;
        System.out.println("Area is: " + area);

        perimeter = t1 + t2 + t3;
        System.out.println("Perimeter is: " + perimeter);
    }
}
