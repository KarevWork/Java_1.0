import java.util.Scanner;

public class FinalTask_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scan.nextInt();
        int[] x = new int[razmer];
        System.out.println("Введите элементы массива: ");
        //Запонение массива данными
        for (int i = 0; i < razmer; i++) {
            x[i] = scan.nextInt();
        }
        //Сортировка массива методом вставки
        int j, temp;
        for (int i = 0; i < razmer; i++) {
            temp = x[i];
            for (j = i - 1; j >= 0 && x[j] > temp; j--) {
                x[j + 1] = x[j];
            }
            x[j + 1] = temp;
        }
        System.out.print("Ваш отсортированный массив: ");
        for (int i = 0; i < razmer; i++) {
            System.out.print(" "+ x[i]);
        }
    }
}
