import java.util.Scanner;
import java.util.Random;

public class ModifikasiQuiz14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int number = rand.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Lebih besar dari jawaban.");
                } else {
                    success = true;
                    System.out.println("Tebakan benar!");
                }

            } while (!success);

            System.out.print("Apakah anda ingin mengulang permainan (Y/T): ");
            menu = input.next().charAt(0);
            input.nextLine();

        } while (menu == 'Y' || menu == 'y');
    }
}