import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz Enter a number");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("a is equal to 1");
                break;
            case 2:
                System.out.println("a is equal to 2");
                break;
            case 4:
                System.out.println("a is equal to 4");
                break;
            default:
                System.out.println("a is not equal anything");
        }

    }
}
