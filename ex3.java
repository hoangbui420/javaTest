public class ex3 {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10000);
        System.out.println(number);
        System.out.println(isPrimeNumber(number));

    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
