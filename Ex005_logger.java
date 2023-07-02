/**
 * В консоли запросить имя пользователя. В зависимости от текущего времени,
 * вывести приветствие вида
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
// import java.time.LocalDateTime;

// import java.util.Scanner;

// public class program {
// public static void main(String[] args) {

// Scanner iScanner = new Scanner(System.in);
// System.out.printf("Hello. What its your name? ");
// String userName = iScanner.next();
// iScanner.close();
// String helloPhrase = "";
// int hours = LocalDateTime.now().getHour();
// if (hours >= 5 && hours <= 11){
// helloPhrase = "Good morning, ";
// }
// else if (hours >= 12 && hours <= 17){
// helloPhrase = "Good day, ";
// }
// else if (hours >= 18 && hours <= 22){
// helloPhrase = "Good evening, ";
// }
// else if ((hours >= 23 && hours <= 24) || (hours >= 0 & hours <= 4)){
// helloPhrase = "Good night, ";
// }
// else
// helloPhrase = "I dont know what time its now, ";

// System.out.println(helloPhrase + userName);
// }
// }

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
// порядке.

// System.out.println(Arrays.toString(array));
// import java.util.Arrays;

// public class WelcomeJava {
// public static void main(String[] args) {
// String phrase = "Добро пожаловать на курс по Java";
// String [] arr = phrase.split(" ");

// // for (int i = arr.length-1; i >= 0; i--){
// // System.out.print(arr[i]);
// // System.out.print(" ");
// // }
// for (String s: arr){
// System.out.print(s + " ");
// }

// }}

// Записать в файл следующие данные:

// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23

// import java.io.FileWriter;
// import java.io.IOException;

// public class fileToWrite {
// public static void main(String[] args) {
// try (FileWriter fw = new FileWriter("file.txt", false)) {
// fw.write("Name Surname Age");
// fw.append('\n');
// fw.append("Kate Smith 20");
// fw.append('\n');
// fw.write("Paul Green 25");
// fw.append('\n');
// fw.write("Mike Black 23");
// fw.append('\n');
// fw.flush();
// } catch (IOException ex) {
// System.out.println(ex.getMessage());
// }
// }
// }

// Напишите метод, который вернет содержимое текущей папки в виде массива строк.

// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < 1_000_000; i++) {
// sb.append("+");
// }

// public class l2t1 {
// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();

// String c1 = "a";
// String c2 = "b";
// int n = 100;
// for (int i = 0; i < n/2; i++) {
// sb.append(c1);
// sb.append(c2);
// }
// System.out.println(sb);
// }
// }

// Напишите метод, который составит строку, состоящую из 100 повторений слова
// TEST и
// метод, который запишет эту строку в простой текстовый файл, обработайте
// исключения.

// public static void main(String[] args) { // метод ввода, печати считает
// try (Scanner in = new Scanner(System.in, "866")) {
// System.out.println("Введите первое число: ");
// float number1 = in.nextFloat();
// System.out.println("Выберите операцию +, -, / или *: ");
// String operation = in.next();
// System.out.println("Введите второе число: ");
// float number2 = in.nextFloat();
// System.out.println(calc(number1, number2, operation));
// try (FileWriter notation = new FileWriter("dz_2/logcalc.txt", true)) {
// notation.append(
// ("считалка: " + number1 + operation + number2 + " = " + calc(number1,
// number2, operation)
// + "\n"));
// notation.close();
// } catch (IOException e) {
// System.out.println(e.toString());
// }
// }

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class l2t3 {
// public static void main(String[] args) {
// String pathProject = System.getProperty("user.dir");
// String pathDir = pathProject.concat("/L2");
// File dir = new File(pathDir);
// String fileName = "L2/l2t3.txt";
// System.out.println(dir.getAbsolutePath());
// for (String fname : dir.list()) {
// UserFileWriter (fileName,fname);
// }
// }

// public static void UserFileWriter(String fileName, String inputString){
// try (FileWriter notation = new FileWriter(fileName, true)) {
// notation.append(inputString + '\n');
// notation.close();
// }
// catch (IOException e) {
// System.out.println(e.toString());
// }
// }
// }

// public class program {
// public static void main(String[] args) {
// String[] name = { "С", "е", "р", "г", "е", "й" };
// String sk = "СЕРГЕЙ КА.";
// System.out.println(sk.toLowerCase());
// System.out.println(String.join("", name));
// System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
// System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
// }
// }

// import java.io.File;

// public class tryDemo {
// public static void main(String[] args) {
// try {
// String pathProject = System.getProperty("user.dir");
// String pathFile = pathProject.concat("/file.txt");
// File f3 = new File(pathFile);
// System.out.println("try");
// } catch (Exception e) {
// System.out.println("catch");
// } finally {
// System.out.println("finally");
// }
// }
// }

import java.io.IOException;
import java.util.logging.*;

public class Ex005_logger {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Ex005_logger.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        // logger.addHandler(ch);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // ch.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}