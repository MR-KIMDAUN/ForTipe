public class acd {
    public static void main(String[] args) {
        int hap = 0;
        for (int a = 1; a < 101; a++){
            if ((a % 3 == 0) && (a % 5 == 0)) {
                hap += a;
            }
        }
        System.out.print(hap);
    }
}
