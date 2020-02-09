import java.util.Scanner;

public class FinalTask_1 {
    public static void main(String[] args) {
        int decInput, dec_value, base, temp, last_digit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        decInput = scan.nextInt();
        dec_value = 0;
        base = 1;
        while (decInput > 0) {
            last_digit = decInput % 10;
            decInput = decInput / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }
        System.out.println("Ваше число в десятичном формате: " + dec_value);
    }
}
