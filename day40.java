import java.util.Scanner;

public class day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        int[] array = {1,3,5,5,5,5,7,123,125};

        int low = 0;
        int high = array.length -1;
        int first = -1;
         int last = -1;

         for(int i = 0 ; i < high ; i++){
            if(array[i] == x){
                if(first == -1){
                    first = i;
                    
                }

                last = i;
            }
         }

         if(first == -1){
            System.out.println("element is not occure");
         }else{
            System.out.println("first occurance = "+first);
         
          System.out.println("first occurance = "+last);
         }
        
    }
}
