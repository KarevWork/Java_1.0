import java.util.Scanner;
public class Task_6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x, y, z, m, average;
        System.out.print("Введите первое число: ");
        x = scan.nextInt();
        System.out.print("Введите второе число: ");
        y = scan.nextInt();
        System.out.print("Введите третье число: ");
        z = scan.nextInt();
        System.out.println("Среднее арифметическое ваших чисел = "+(average=(x+y+z)/3));
        m = average/2;
        if (m>3){
            System.out.print("Программа выполнена корректно");
        }
    }
}