/* write a program to find print sum of all possible prime number within the range */


import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number range");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0;
        for(int i = n1 ; i <= n2 ; i++){
            if(findPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    static boolean findPrime(int n1){
        if(n1 == 1 ){
            return false;
        }

        int flag = 1;
        for(int i = 2 ; i <= Math.sqrt(n1) ; i++){
            if(n1 % i == 0){
                flag = 0;
                return false;
            }
        }
        if(flag == 1){
            return true;
        }
        return false;
    }
}
