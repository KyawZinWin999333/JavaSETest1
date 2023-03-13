import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        int[] numbers = new int[length];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < length; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The output is ");
        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

    }
}
