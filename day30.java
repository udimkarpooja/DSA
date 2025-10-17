import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i = n1 ; i < n2 ; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static boolean isPrime(int num ){
        if(num < 2){
            return false;
        }
        int flag = 0 ;
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                flag = 1;
                return false;
            }
        }
        if(flag == 0){
            return true;
        }
        return false;
    }
}
 
