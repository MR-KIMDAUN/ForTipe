public class forGUGU {
    public static void main(String[] args) {

        for(int a = 2; a < 10; a++){
            if ((a == 3) || (a == 5)) {
                System.out.printf("<%d 단>\n",a);
            }
                for (int num = 1; num < 10; num++) {
                    System.out.printf("%d * %d = %d \n", a, num, a * num);
                }

            System.out.println();
        }
    }
}
