import java.util.Scanner;

public class Task_4 {
        // Разработайте программу, которая выбросит Exception,
        // когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) throws Exception {
        userInput();
    }
    public static void userInput() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}