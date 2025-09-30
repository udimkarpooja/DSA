//Program to print fibonacci series

import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*for(int i = 0 ; i < n ; i++){
            System.out.println(fobonacci(i));
        }*/

        for(int i = 0 ; i < n ; i++){
             System.out.println(fibonacciSeries(i));
        }
       

        
    }

     /*static int fobonacci(int n){
        int a = 0;
        int b = 1;
                                       
        for(int i = 0 ; i < n; i++){     // iterative method 
           
            int temp = a;
            a = b;
            b = temp+b;
           
        }
        return a;
     }

     */

     static int fibonacciSeries(int n){

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        int fn = fibonacciSeries(n - 1) + fibonacciSeries(n - 2);

        return fn;
     }
}
