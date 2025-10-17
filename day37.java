import java.util.ArrayList;
import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sum: ");
        int sum = sc.nextInt();
        System.out.println("No. of array element: ");
        int no = sc.nextInt();
        System.out.println("enter array elements: ");
        int[] array = new int[no];
        for(int i = 0 ; i < no ; i++){
            array[i] = sc.nextInt();
        }

        mergesort(array , 0 , no-1);
        System.out.println("after sorting: ");
        for(int i = 0 ; i < no ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int i = 0 ;
        int j = no-1;

        while (i < j) {
            if(array[i]+array[j] == sum){
                System.out.println("the sum of two pair is "+array[i] + " and "+array[j]);
                return;
            }else if(array[i]+array[j] < sum){
                i++;
            }else{
                j--;
            }
        }
    }


    

    static void mergesort(int[] array , int low , int high){
        if(low >= high){
            return;
        }
        int mid = (low + high)/2;

        mergesort(array, low, mid);
        mergesort(array, mid+1, high);
        merge(array, low, mid ,high);

    }

    static void merge(int[] array , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while (left <= mid && right <= high ) {
            if(array[left] <= array[right]){
                temp.add(array[left]);
                left++;
            }else{
                temp.add(array[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }

        while(right <= high){
            temp.add(array[right]);
            right++;
        }
        
        for(int i = low ; i <= high ; i++){
            array[i] = temp.get(i-low);
        }
    }
}
