import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите любой набор символов: ");
        String userString = scan.nextLine();
        //1 вариант вывода введённой строки
        System.out.println("Ваша строка: "+userString);
        //2 вариант вывода введённой строки
        System.out.printf("Ваша строка: %s",userString);
    }
}

