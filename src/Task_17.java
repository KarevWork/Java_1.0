import java.io.*;
import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {
        try {
            System.out.println("Для прекращения записи введите 'Stop'");
            FileWriter fw = new FileWriter("TestFileWriter");
            Scanner scan = new Scanner(System.in);
            System.out.println("Начните вводить свой текст: ");
            String str;
            while (true){
                str = scan.nextLine();
                if (str.equals("Stop")) {
                    break;
                }
                else {
                    fw.write(str + "\n");
                }
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
