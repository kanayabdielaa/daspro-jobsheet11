import java.util.Scanner;

public class Modif1NestedLoop14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (int j = 0; j < temps.length; j++) {
                System.out.println("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + i);
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }
    }
}