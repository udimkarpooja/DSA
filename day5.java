// to check second largest number among 3 number
import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a >= b && a >= c){
            if(b >= c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }else if( b >= c && b >= a){
            if(c >= a){
                System.out.println(c);
            }else{
                System.out.println(a);
            }
        }else if(c >= a && c >= b){
            if(a >= b){
                System.out.println(a);
            }else{
                System.out.println(b);
            }
        }
    }
}
