import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz Enter your desire color");
        String color=sc.nextLine();
        switch(color){
            case "white":
                System.out.println("color is white");
                break;
            case "black":
                System.out.println("color is black");
                break;
            case "green":
                System.out.println("color is green");
                break;
            case "red":
                System.out.println("color is red");
                break;
            default:
                System.out.println("there is no color");

        }
    }
}
