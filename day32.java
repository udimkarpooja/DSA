import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day/month/year:");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        int[] dayarr = {31, 28, 31, 30, 31, 30, 31, 31 , 30, 31, 30, 31};

        if(day < 32 && day > 0  && month > 0 && month < 13){
            System.out.println((dayarr[month-1]));
        }else{
            System.out.println("invalid input");
        }
    }
}
