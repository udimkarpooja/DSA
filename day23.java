import java.util.Scanner;

public class day23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first cordinates: ");
        int X1 = sc.nextInt();
        int Y1 = sc.nextInt();
        System.out.println("enter the second cordinate: ");
        int X2 = sc.nextInt();
        int Y2 = sc.nextInt();

        int sum = (X2 - X1)*(X2 - X1) + (Y2 - Y2)*(Y2 - Y1);

        double distance = Math.sqrt(sum);
        System.out.println(distance);
    }
}
