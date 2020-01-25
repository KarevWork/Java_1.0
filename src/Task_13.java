import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String userString1 = scan.nextLine();
        System.out.print("Введите вторую строку: ");
        String userString2 = scan.nextLine();
        if (userString1.length() > userString2.length()) {
            System.out.println("Длина первой строки больше второй");
        } else if (userString1.length() < userString2.length())
            System.out.println("Длина второй строки больше первой");
        else {
            System.out.println("Длины ваших строк равны");
        }
    }
}
