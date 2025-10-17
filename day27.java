import java.util.Scanner;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(GCD(n1 , n2));
    }

    static int GCD(int n1 , int n2){
        if(n1 == 0){
            return n2;
        }else if(n2 == 0){
            return n1;
        }else if(n1 == n2){
            return n1;
        }else if(n1 > n2){
            return GCD(n1-n2 , n2);
        }
        return GCD(n1 , n2-n1);
    }
}
