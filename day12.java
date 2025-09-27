import java.util.ArrayList;
import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sum:");
        int sum = sc.nextInt();
        System.out.println("enter no. of array element:");
        int no = sc.nextInt();
        System.out.println("enter the array element:");
        int[] arr = new int[no];
        for(int i = 0 ; i < no ; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr,0,no-1);
        for(int i = 0 ; i < no ; i++){
            System.out.println(arr[i]);
        }

        if(findsum(arr,sum)){
            System.out.println("Array has two element with given sum");
        }else{
            System.out.println("Array has no two element with given sum");
        }
    }

    static boolean findsum(int[] arr , int sum){
        int l = 0;
        int r = arr.length - 1;
        
        while (l <= r) {
            if(arr[l] + arr[r] == sum){
                return true;
            }else if(arr[l] + arr[r] < sum){
                l++;
            }else{
                r--;
            }
        }

        return false;
    }

    static void mergeSort(int[] arr , int low , int high){
        if(low >= high){
            return;
        }

        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid ,high);
    }

    static void merge(int[] arr , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int right = low;
        int left = mid+1;

        while (right <= mid && left <= high) {
            if(arr[right] <= arr[left]){
                temp.add(arr[right]);
                right++;
            }else{
                temp.add(arr[left]);
                left++;
            }
        }

        while (right <= mid) {
            temp.add(arr[right]);
            right++;
        }

        while (left <= high) {
            temp.add(arr[left]);
            left++;
        }

        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i-low);
        }
    }

}
