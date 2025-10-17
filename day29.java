import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for(int i = n1 ; i < n2 ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
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
