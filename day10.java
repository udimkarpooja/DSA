import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number row and column:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int i,j;
        for(i = 1 ; i <= row ; i++){
            for(j = 1 ; j <= column ; j++){

                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
