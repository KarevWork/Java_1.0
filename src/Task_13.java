import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String userString1 = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String userString2 = scan.nextLine();
        System.out.println("Какая из строк длиньше?");
        if (userString1.length() > userString2.length()) {
            System.out.println("Первая: " + userString1);
        } else if (userString1.length() < userString2.length()) {
            System.out.println("Вторая: " + userString2);
        } else {
            System.out.println("Длины ваших строк равны");
        }
    }
}
