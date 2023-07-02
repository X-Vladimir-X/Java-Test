package Seminar_1.java;

import java.util.Scanner;

public class EquationSolver {
    Scanner scanner = new Scanner(System.in);System.out.print("Введите уравнение: ");
    String equation = scanner.nextLine();
    String[] parts = equation.split("\s*[+=]\s");

    int q = -1, w = -1, e = -1;

    for(
    int i = 0;i<10;i++)
    {
        if (q == -1 && !parts[0].contains("?")) {
            q = Integer.parseInt(parts[0]);
        }
        if (w == -1 && !parts[1].contains("?")) {
            w = Integer.parseInt(parts[1]);
        }
        if (e == -1 && !parts[2].contains("?")) {
            e = Integer.parseInt(parts[2]);
        }
        if (parts[0].charAt(i) == '?') {
            q = i;
        }
        if (parts[1].charAt(i) == '?') {
            w = i;
        }
        if (parts[2].charAt(i) == '?') {
            e = i;
        }

        if (q + w == e && q != -1 && w != -1 && e != -1) {
            System.out.printf("%d + %d = %d, q, w, e,");
        } else {
            System.out.println("Решений нет");
        }
    }

}
