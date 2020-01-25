import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любой набор символов, добавляя пробелы: ");
        String userString = scan.nextLine();
        System.out.print("Ваши символы без пробелов: " + userString.replace(" ", ""));
    }
}
