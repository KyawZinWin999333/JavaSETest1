import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();

        System.out.println("a ="+a);
        System.out.println("b ="+b);

        int c=a;
        a=b;
        b=c;
        System.out.println("A="+a);
        System.out.println("B="+b);
    }
}
