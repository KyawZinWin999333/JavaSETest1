import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz Enter array size");
        int size=sc.nextInt();
        int[] num=new int[size];
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        num[3]=sc.nextInt();
        num[4]=sc.nextInt();
        System.out.println(Arrays.toString(num));

        int largestnum=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>largestnum){
                largestnum=num[i];
            }

        }
        System.out.println("The Largest Number is "+largestnum);
    }
}
