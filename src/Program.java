import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Size of the matriz = ");
        int size = sc.nextInt();
        System.out.print("\n");
        int[][] matriz = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int randomNumber = (int) (Math.random() * (9 + 1));
                matriz[i][j] = randomNumber;
            }
        }

        int count = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
                count++;
                if (count == size) {
                    System.out.print("\n");
                    count = 0;

                }
            }
        }
    }
}