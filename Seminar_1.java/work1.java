
import java.util.Scanner;

public class work1 {
    static int getTriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int getFactorial(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("введи натуральное число: ");
        if (!scn.hasNextInt()) {
            System.out.println("Вы ввели неправильное число!!!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Вы должны ввести положительное число!!!");
            else {
                System.out.printf("Треугольное число ", n, getTriangleNumber(n));
                System.out.println();
                System.out.printf("Это факториал ", n, getFactorial(n));
            }
        }
        scn.close();
    }
}
