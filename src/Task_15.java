import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int razmer = scan.nextInt();
        int[] x = new int[razmer];
        System.out.print("Введите элементы массива через пробел: ");
        for (int i = 0; i < razmer; i++) {
            x[i] = scan.nextInt();
        }
        //Первый вариант
        /*boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    sorted = false;
                    int temp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = temp;
                }
            }
        }*/
        //Второй вариант
        for (int i = x.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j+1]=temp;
                }
            }
        }
        System.out.print("Ваш отсортированный массив:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + x[i]);
        }
    }
}