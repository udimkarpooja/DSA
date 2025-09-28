import java.util.Scanner;

public class day17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to convert decimal to binary: ");
        int n = sc.nextInt();
        int size = n/2;
        int rem = 0; int[] pro = new int[size] ;
        int j = 0;
        while(n > 0){
           rem = n%2;
            pro[j] = rem;
            n /= 2;
            j++;
        }

        for(int i = j-1 ; i >= 0 ; i--){
            System.out.print(pro[i]);
        }
        
    }
}
