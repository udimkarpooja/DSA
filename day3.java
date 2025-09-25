import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three number to check the maximum number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int maxi = (n1 > n2)? ((n1 > n3)? n1 : n3) : (n2 > n3)? n2 : n3 ;
        System.out.println(maxi);
    }
}
