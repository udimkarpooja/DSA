import java.util.Scanner;

public class day26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        final float pi = 3.14f;
        float radius = dia/2.0f;
        
        float area_of_circle = pi*(float)Math.pow(radius , 2);
        System.out.println(area_of_circle);
    }
}
