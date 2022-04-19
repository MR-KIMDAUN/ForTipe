//import java.util.Scanner;

public class abcde {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        //int a = s.nextInt();
        int a = 1;
        while (a < 10) {
            int b = 1;
            while (b < 10) {
                if (a % 2 == 1){
                System.out.printf("%d * %d = %d \n", a, b, a*b);}
                b++;
            }
            a++;
        }
    }
}