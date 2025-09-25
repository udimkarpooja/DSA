import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of the prime no do you want to print");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1 ; i <= n2 ; i++){
            if(findPrime(i)){
                System.out.println(i);
            }
        }
    }
  static boolean findPrime(int n1){
    if(n1 == 1){
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
