import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 3 == 0)
                System.out.print(array[i] + " ");
        }
    }
}