package list1.First.prac3;
import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        int arrayLength = 10; // Длина массива

        // Генерируем массив с использованием метода random() класса Math
        double[] array1 = generateRandomArrayUsingMath(arrayLength);

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки (используя Math.random()):");
        printArray(array1);

        // Сортируем массив
        Arrays.sort(array1);

        // Выводим массив после сортировки
        System.out.println("\nМассив после сортировки (используя Math.random()):");
        printArray(array1);

        // Генерируем массив с использованием класса Random
        double[] array2 = generateRandomArrayUsingRandomClass(arrayLength);

        // Выводим массив до сортировки
        System.out.println("\nМассив до сортировки (используя класс Random):");
        printArray(array2);

        // Сортируем массив
        Arrays.sort(array2);

        // Выводим массив после сортировки
        System.out.println("\nМассив после сортировки (используя класс Random):");
        printArray(array2);
    }

    // Метод для генерации массива с использованием метода random() класса Math
    public static double[] generateRandomArrayUsingMath(int length) {
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random(); // Генерация случайного числа от 0.0 до 1.0
        }
        return array;
    }

    // Метод для генерации массива с использованием класса Random
    public static double[] generateRandomArrayUsingRandomClass(int length) {
        double[] array = new double[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble(); // Генерация случайного числа от 0.0 до 1.0
        }
        return array;
    }

    // Метод для вывода массива на экран
    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
