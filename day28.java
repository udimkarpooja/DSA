import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println(num+" is a prime number "+Math.sqrt(num));
        }else{
            System.out.println(num+" is not a prime number ");
        }
      
    }

    static boolean isPrime(int num){
        int flag = 0;
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
