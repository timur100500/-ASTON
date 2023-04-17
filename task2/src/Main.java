import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (name.equals("вячеслав")) {
            System.out.print("Привет, Вячеслав");
        } else {
            System.out.print("Нет такого имени");
        }

    }
}