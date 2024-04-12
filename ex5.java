import java.util.Arrays;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so dong");
        int soDong = input.nextInt();
        System.out.println("nhap so cot");
        int soCot = input.nextInt();
        int[][] numbers = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                numbers[i][j] = input.nextInt();
            }
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(numbers[i][j] + "\t");
            }

            System.out.println("\n");
        }
        int[] duongcheo = new int[soDong];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if (i == j) {
                    duongcheo[i] = numbers[i][j];
                }
            }
        }
        System.out.println("duong cheo la" + Arrays.toString(duongcheo));
        int[][] numbers2 = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
                numbers2[i][j] = input.nextInt();
            }
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(numbers2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int[][] numbers3 = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                numbers3[i][j] = numbers[i][j] + numbers2[i][j];
            }
        }
        System.out.println("Mang tong cua 2 mang: ");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(numbers3[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}