// check the number is perfect number or not
//153 = 3 digit number = 1^3+5^3+3^3 = 1+125+27= 153 
import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int num = n;
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;

        }
        int num1 = n;
        int num2 = 0;
        while (n > 0) {
            int rem = n %10;
            num2 = num2 + (int)Math.pow(rem , count);
            n = n / 10;
        }

        if(num1 == num2){
            System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }


    }
}
