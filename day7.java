// program to check number is perfect square or not
// if yes print success
// if no print failure
import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive number: ");
        int n1 = sc.nextInt();

        double num = Math.sqrt(n1); 
        int num2 = (int)num;

        if(num == num2){
            System.out.println("Success");
        }else{
            System.out.println("failure");
        }

    }
}
