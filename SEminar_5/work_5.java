package SEminar_5;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// public class work_5 {
// public static void main(String[] args) {
// //
// String[] names = new String[] {
// "Белов Роман Артёмович", "Белов Роман Артёмович", "Родионов Иван Давидович",
// "Баженова Татьяна Олеговна", "Демидов Артём Владимирович", "Панфилов Иван
// Максимович",
// "Молчанов Гордей Георгиевич", "Пастухов Артемий Михайлович", "Романов Дмитрий
// Артемьевич",
// "Давыдова Марьям Мироновна" };
// Integer[] numbers = new Integer[] {
// 11111111, 22222222, 33333333, 44444444, 55555555,
// 66666666, 77777777, 88888888, 99999999, 11111112 };
// // переопределяем метод toString для красивого вывода
// Map<String, ArrayList<Integer>> phoneBook = new HashMap<>() {
// @Override
// public String toString() {
// StringBuilder sb = new StringBuilder();
// forEach((key, value) -> sb.append(String.format("%30s ", key)).append("
// ").append(value).append("\n"));
// return sb.toString();
// }
// };
// // заполяем с учетом разных номеров у человека
// for (int i = 0; i < names.length; i++) {
// ArrayList<Integer> tmp = new ArrayList<>(1);
// if (phoneBook.containsKey(names[i])) {
// phoneBook.get(names[i]).add(numbers[i]);
// } else {
// tmp.add(numbers[i]);
// phoneBook.put(names[i], tmp);
// }
// }
// System.out.println(phoneBook);
// System.out.println("=".repeat(120));
// // Сортируем по значению и выводим в потоке
// StringBuilder sb = new StringBuilder();
// phoneBook.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) ->
// o2.size() - o1.size()))
// .forEach(System.out::println);
// }
// }

// public class work_5 {

// static int[] chessboard = { 0, 0, 0, 0, 0, 0, 0, 0 };
// static int index = 0;
// static int version = 0;

// public static void main(String[] args) {

// do {
// if (checking()) {
// if (index == 7) {
// System.out.println(version++ + " [0]=" + chessboard[0] + " [1]=" +
// chessboard[1] + " [2]="
// + chessboard[2] + " [3]=" + chessboard[3] + " [4]=" + chessboard[4] + " [5]="
// + chessboard[5] + " [6]=" + chessboard[6] + " [7]=" + chessboard[7]);
// chessboard[index]++;
// } else {
// index++;
// }
// } else {
// chessboard[index]++;
// }
// } while (chessboard[0] < 8);
// }

// static boolean checking() {
// int i;

// if (index == 0) {
// return true;
// }

// if (chessboard[index] > 7) {
// chessboard[index] = 0;
// index--;
// return false;
// }

// for (i = 0; i < index; i++) {
// if ((chessboard[index] == chessboard[i]) | ((Math.abs(chessboard[index] -
// chessboard[i])) == (index - i))) {
// return false;
// }
// }

import java.util.Arrays;

/**
 * Реализация сортировки слиянием
 */
public class work_5 {
    public static void main(String[] args) {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43 };
        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}

// return true;
// }
// }
