import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number > 7) {
            System.out.print("Привет");
        } else if (number <= 7) {
            System.out.print("Не то число");
        }
    }
}