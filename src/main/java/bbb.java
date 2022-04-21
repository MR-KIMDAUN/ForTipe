public class bbb {
    public static void main(String[] args) {
        int i = 2;
        while (i < 10) {
            if ((i == 3) || (i == 5)) {
                System.out.printf("<%d 단> \n", i);
            }

            int j = 1;
            while (j < 10) {
                System.out.printf("%d * %d = %d \n", i, j, i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
