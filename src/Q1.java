import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter factorial number:");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int factorial=n*i;
            System.out.println(factorial);

        }
    }
}
