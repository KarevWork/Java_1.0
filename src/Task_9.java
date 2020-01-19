import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scan.nextInt();
        int[] x = new int[razmer];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < razmer; i++) {
            x[i] = scan.nextInt();
        }
        System.out.print("Ваш массив, с увеличенными в 2 раза элементами: ");
        for (int i = 0; i < razmer ; i++) {
            System.out.print(" " + x[i]*2);
        }
    }
}
