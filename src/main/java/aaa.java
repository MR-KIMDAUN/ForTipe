import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int gop = s.nextInt();
        int num = 1;
        for (int i = 1; i <= gop; i++){
            if(i % 2 == 1) {
                num = num * i;
            }
        }
        System.out.printf("%d", num);
    }
}