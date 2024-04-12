public class ex4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i=0; i < 1000; i++){
            if (isPrimeNumber(i) == true && count < 10){
                count += 1;
                System.out.println(i);
            }
        }


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
