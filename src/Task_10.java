import java.util.Scanner;
import java.util.Random;
public class Task_10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число строк матрицы: ");
        int str = scan.nextInt();
        System.out.print("Введите число столбцов матрицы: ");
        int stb = scan.nextInt();
        int[][] matrix = new int[str][stb];
        System.out.println("Ваша матрица: ");
        for (int i= 0; i <str; i++){
            for (int j=0; j<stb; j++){
                matrix[i][j]=rnd.nextInt(10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Первая строка матрицы увеличенная в 3 раза: ");
        for (int i = str-1; i <str ; i++) {
            for (int j = 0; j <stb ; j++) {
                System.out.print(matrix[0][j]*3+" ");
            }
            System.out.println();
        }
    }
}
