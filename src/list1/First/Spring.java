package list1.First;
import java.util.Scanner;
public class Spring {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Ввод элементов массива с клавиатуры
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Инициализация переменных для суммы, максимального и минимального элементов
        int sum = 0;
        int max = array[0];
        int min = array[0];

        // Вычисление суммы элементов с использованием цикла do-while
        int i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < size);

        // Вычисление максимального и минимального элементов
        i = 1;
        while (i < size) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }

        // Вывод результатов
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        scanner.close();


    }
}