import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scan.nextInt();
        final int X = 2;
        final int Y = 6;
        final int Z = 10;
        // Первый вариант
        if (number == X || number == Y || number == Z) {
            System.out.print("Данное значение имеется в константах");
        }
        else {
            System.out.print("Такой константы нет!");
        }
        // Второй вариант
        /*
        switch (number) {
            case X:
            case Y:
            case Z:
                System.out.print("Данное значение имеется в константах");
                break;
            default:
                System.out.print("Такой константы нет!");
         */
    }
}
