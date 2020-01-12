import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.next();
        int y = Integer.parseInt(num, 2);
        System.out.print("Your number: " + y);
    }
}