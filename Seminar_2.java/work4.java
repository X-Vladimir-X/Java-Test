
import java.util.*;
import java.io.IOException;
import java.util.logging.*;

public class work4 {
    private static double prevResult = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите выражение (или q для выхода ): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Вы вышли из калькулятора.\nПока.");
                break;
            }
            if (input.charAt(0) == '+' || input.charAt(0) == '-' || input.charAt(0) == '*' || input.charAt(0) == '/') {
                input = prevResult + input;
            }
            Object helper;
            prevResult = helper.evaluate(input);
            System.out.println("Результат: " + prevResult);
        }
        sc.close();

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
