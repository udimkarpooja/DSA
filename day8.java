// Program to find sum of digits
// input : any integer positive number
// output : Print sum of all its digits.

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Any positive number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num%10;
            sum = sum + rem;
            num /= 10;
        }

        System.out.println(sum);
    }
}
