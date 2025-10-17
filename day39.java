import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int sum = no;
        int sum2 = 0;
        int no2 = no;
        int cnt = 0;

        while (no2 > 0) {
            cnt++;
            no2 = no2/10;
        }
        while (no > 0) {
            int rem = no%10;
            sum2 = sum2 + (int)Math.pow(rem , cnt);
            no = no / 10;
        }

        if(sum == sum2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        
    }
}
