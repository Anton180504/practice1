package list1.First.prac3;

import java.util.Random;

public class RandomArrayCheck {
    public static void main(String[] args) {
        int[] array = new int[4]; // Создаем массив из 4 элементов

        Random random = new Random();

        // Заполняем массив случайными целыми числами из отрезка [10;99]
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
        }

        // Выводим массив на экран в строку
        System.out.print("Сгенерированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) { // Если текущий элемент меньше или равен предыдущему
                isIncreasing = false;
                break; // Если найдено нарушение последовательности, выходим из цикла
            }
        }

        // Выводим результат на экран
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}

