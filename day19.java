import java.util.Scanner;

public class day19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to convert decimal to hexadecimal");
        int n = sc.nextInt();
        int[] arr = new int[n/2];
        int j = 0;
        while (n > 0) {
            int rem = n%16;
            if(rem == 10){
                rem = 'A';
            }else if(rem == 11){
                rem = 'B';
            }else if(rem == 12){
                rem = 'C';
            }else if(rem == 13){
                rem = 'D';
            }else if(rem == 14){
                rem = 'E';
            }else if(rem == 15){
                rem = 'F';
            }
            arr[j] = rem;
            j++;
            n = n / 16;
        }

        for(int i = j-1 ; i >= 0 ; i--){
            if(arr[i] > 64){
                System.out.print((char)arr[i]);
            }else{
                System.out.print(arr[i]);
            }
        }
    }
}
