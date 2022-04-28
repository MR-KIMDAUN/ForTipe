import java.util.Scanner;

public class star3 { //별찍기 피라미드

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int star = 1; // 첫줄에 출력 때문에 1로 설정
        int none = a - 1; // 별이 첫줄에 a값에 찍히므로 a-1까지 나오게 설정

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < star + none; j++) {
                if (j < none) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            star+=2;//별이 줄마다 두개씩 늘어남
            none--;//공백은 하나씩 줄어듦
        }
    }
}