import java.util.Scanner;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array element: ");
        int no = sc.nextInt();
        System.out.println("enter number to check the occurance: ");
        int occurance = sc.nextInt();
        System.out.println("enter array element: ");
        int[] arr = new int[no];
        for(int i = 0 ; i < no ; i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = no-1;
        while (left <= right) {
            if(arr[left] == occurance){
               break;
            }else{
               left++;
            }

            if(arr[right] == occurance){
                break;
            }else{
                right--;
            }
        }

        System.out.println("first occurance "+left);
        System.out.println("last occurance "+right);
    }
}
