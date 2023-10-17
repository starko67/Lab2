package lab2;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        // Разбиваем введенную строку на слова по пробелам
        String[] words = input.split("\\s+");

        // Считаем количество слов
        int wordCount = words.length;

        System.out.println("Количество слов в строке: " + wordCount);
    }
}
