public class ex2 {
    public static void main(String[] args) {
        System.out.println(index("rrroooooo"));
    }
    public static int index(String str){
        int count = 0;
        String str1 = "o";
        for (int i=0; i < str.length(); i++){
            if ( str.charAt(i) == str1.charAt(0)){
                count += 1;

            }
        }
        return count;
    }
}
