// package Seminar_4;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// public class work_4 {
// public static <T> List<T> reverseList(List<T> list) {
// // Делаем копию и переворачиваем
// List<T> reverse = new ArrayList<>(list);
// Collections.reverse(reverse);
// return reverse;
// }

// public static void main(String[] args) {
// List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

// List<Integer> reverse = reverseList(list);
// System.out.println(reverse);
// }
// }

public class work_4 {

    public static void main(String[] args) {
        int[] ints = { 1, -1, 2, -1 };
        System.out.println(isArrayAlternating(ints));
    }

    // Описываем метод
    public static boolean isArrayAlternating(int[] ints) {
        if (ints == null || ints.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != ints[i + 1] * (-1)) {
                return false;
            }
        }
    }
}