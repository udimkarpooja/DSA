import java.util.Scanner;

public class day20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number to convert into the decimal: ");
        int n = sc.nextInt();
        int sum = 0 , cnt = 0;
        while(n > 0){
            int rem = n%10;
            if(rem == 1){
                sum = sum + (int)Math.pow(2, cnt);
            }
            
            cnt++;
            n = n /10;
        }
        System.out.println(sum);

    }
}
