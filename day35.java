import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 0;
        while(num > 0){
            int rem = num % 10;
            num2 = num2*10 + rem;
            num = num / 10;
        }

        while(num2 > 0){
            System.out.print(num2%10 + " ");
            num2 = num2/10;
        }
    }
}
