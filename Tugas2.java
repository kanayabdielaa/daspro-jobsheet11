import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai N (minimal 5): ");
        int N = sc.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5!");
        } else {
            int i = N;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i--;
            }
        }
    }
}