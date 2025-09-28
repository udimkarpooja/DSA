//convert decimal number to octal

import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int[] str = new int[n/2];
        int j = 0;
        while (n > 0) {
            int rem = n%8;
            str[j] = rem;
            n /= 8;
            j++;
        }

        for(int i = j-1 ; i >= 0 ; i--){
            System.out.print(str[i]);
        }
    }
}
