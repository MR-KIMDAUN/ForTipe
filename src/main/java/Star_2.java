import java.util.Scanner;

public class Star_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int num = a;

        for (int i = num; i > 0; i--) {
            for (int j = num - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i * 2 - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}