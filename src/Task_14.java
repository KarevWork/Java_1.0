import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = scan.nextLine();
        int X = Integer.parseInt(S);
        //Первый вариант
        double Y = X;
        System.out.print("Ваше число с типами string, int и double:\n" + S + "\n" + X + "\n" + Y);
        //Второй вариант
        //System.out.print("Ваше число с типами string, int и double:\n" + S + "\n" + X + "\n" + (double) X);
    }
}
