import java.util.Scanner;

public class FinalTask_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в десятичном формате: ");
        int a, b;
        a = scan.nextInt();
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.println(temp);
    }
}
