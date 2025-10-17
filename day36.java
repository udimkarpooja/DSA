import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < m ; j++){
                if(i == 0 || i == (n-1) || j == 0 || j == (n-1) ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
