import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        //int inc = a;
        int dec = a*2-1;

        for (int i = 0; i < a; i++){
            for (int j = 0; j < dec; j++){
                if (j < a){
                    System.out.printf("#");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
            //inc++;
            dec++;
        }
    }
}
