import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (Objects.equals(name, "Вячеслав")) System.out.println("Привет, " + name);
        else {
            System.out.println("Нет такого имени");
        }
    }
}