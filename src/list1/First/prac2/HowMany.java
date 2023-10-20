package list1.First.prac2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания ввода с консоли

        System.out.println("Введите текст:"); // Просим пользователя ввести текст
        String inputText = scanner.nextLine(); // Считываем введенный текст

        int wordCount = countWords(inputText); // Вызываем метод для подсчета слов в тексте

        System.out.println("Количество слов во введенном тексте: " + wordCount); // Выводим результат
    }

    // Метод для подсчета слов в тексте
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0; // Если текст пустой или равен null, возвращаем 0 слов
        }

        // Разделяем текст на слова, используя пробелы и другие пробельные символы в качестве разделителей
        String[] words = text.split("\\s+");
        return words.length; // Возвращаем количество слов в тексте
    }
}
