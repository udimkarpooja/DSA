// Print digits of a given number in same order
//input: any integer positive number
// output: Print digits of the input number in same order in space separated fashion.
// 123 = 1 2 3

import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = sc.nextInt();

        int num2 = 0;
        while (number > 0) {
            int rem = number%10;
            num2 = num2*10 + rem;
            number /= 10;
        }

        while (num2 > 0) {
            int rem = num2%10;
            System.out.print(rem+" ");
            num2 /= 10;
        }

    }
}
