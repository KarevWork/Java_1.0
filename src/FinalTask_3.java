import java.util.Scanner;

public class FinalTask_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму (в рублях) для перевода: ");
        float sum = scan.nextFloat();
        System.out.println("Введите текущий курс $ через запятую: ");
        float course = scan.nextFloat();
        float result = sum / course;
        System.out.println("Ваша сумма в $: " + String.format("%.2f", result));
    }
}
