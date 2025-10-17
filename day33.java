import java.util.Scanner;

public class day33 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2 ;
        int sq;

        while (true) {
            sq = i*i;
            if(sq == n){
                System.out.println("sucess");
                return;
            }
            if(sq > n){
                System.out.println("failure");
                return;
            }
            i++;
        }
    }
}
