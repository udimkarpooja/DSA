
// program to find LCM...
import java.util.Scanner;

public class day22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("LCM of "+n1+" and "+n2+": "+LCM(n1 , n2));
    }

    static int LCM(int n1 , int n2){ // finding least common multiple 
       return (n1*n2)/gcd(n1,n2);
        }

    static int gcd(int a , int b){  // finding greatest common devisor
        if(a==0){
            return b;
        }
        return gcd(b%a , a);
    }

        

}

