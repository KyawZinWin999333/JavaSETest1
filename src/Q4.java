import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz Enter your input");
        int input=sc.nextInt();
        if(input<10){
            System.out.println("Your input is equal to 1");
        }else if(input<20){
            System.out.println("Your input is equal to 2");
        }else if(input<30){
            System.out.println("Your input is equal to 3");
        }else{
            System.out.println("There is no value equal to your input");
        }
    }
}
