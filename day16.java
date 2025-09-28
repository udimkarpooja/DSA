//Program to show time in 24 formate 

import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hour:");
        int HH = sc.nextInt();
        System.out.println("enter minutes:");
        int MM = sc.nextInt();
        System.out.println("enter second:");
        int SS = sc.nextInt();
        System.out.println("enter AM or PM:");
        String str = sc.next();

        if(HH > 0 && HH <= 12 && MM > 0 && MM <= 59 && SS >0 && SS <= 59 &&
        (str.compareTo("PM") == 0 || str.compareTo("pm") == 0|| str.compareTo("AM") == 0|| str.compareTo("am") == 0)){
            if(HH < 12 &&((str.compareTo("PM") == 0 || str.compareTo("pm") == 0))){
                HH = HH + 12;
                System.out.println("Time in 24 formate:" + HH + "-" + MM + "-" + SS+" "+str);
            }else{
                System.out.println("Time in 24 formate:" + HH + "-" + MM + "-" + SS+" "+str);
            }
        }
    }
}
