import java.util.Scanner;

public class star1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int inc = a; // a가 3일 때 증가하는 값도 3
        int dec = a-1; // 3-1 = 2 감소 하는 값 2

        for(int i = 0; i < a; i++){ // i가 세로로 3줄 출력
            for(int j = 0; j < inc; j++){ //j가 가로로 3번
                if(j < dec) { // 0 < 2니까 # 1<2니까 # 2<2 성립이 안되니까 *
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
            inc++;
            dec--;
        }

    }
}
