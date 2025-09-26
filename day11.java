import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sum: ");
        int sum = sc.nextInt();
        System.out.println("No. of array element: ");
        int Noof_array_ele = sc.nextInt();
        System.out.println("enter the array elements are: ");
        int[] arr = new int[Noof_array_ele];
        for(int i = 0 ; i < Noof_array_ele ; i++){
            arr[i] = sc.nextInt();
        }
        int flag = 0;

         for(int i = 0 ; i < Noof_array_ele ; i++){
            for(int j = i ; j < Noof_array_ele ; j++){
                if((arr[i] + arr[j]) == sum){
                    System.out.println("Array has two element with given sum");
                    flag = 1;
                    break;
                }
            }
            if(flag > 0)
            break;
            
         }

         if(flag == 0){
            System.out.println("Array doesnt have two element with given sum");
         }

    }
}
