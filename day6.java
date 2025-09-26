// return the nummber of days in the perticular month
import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date month year:");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findNumberofDays(month));
    }

    static int findNumberofDays(int month){

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31};

        if(month < 1){
            return 0;
        }

        if(month > 12){
            return 0;
        }

        int token = arr[month-1];
        return token;
    }
}
