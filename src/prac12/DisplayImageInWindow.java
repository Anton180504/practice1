package prac12;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class DisplayImageInWindow {
    public static void main(String[] args) {
        // Проверяем, есть ли аргумент командной строки, содержащий путь к картинке
        if (args.length != 1) {
            System.out.println("Использование: java DisplayImageInWindow <путь_к_картинке>");
            System.exit(1);
        }

        // Получаем путь к картинке из аргумента командной строки
        String imagePath = args[0];

        // Создаем окно
        JFrame frame = new JFrame("Отображение картинки");

        // Создаем компонент для отображения картинки
        JLabel label = new JLabel();

        // Проверяем, существует ли файл по указанному пути
        File imageFile = new File(imagePath);
        if (imageFile.exists() && imageFile.isFile()) {
            // Загружаем картинку и устанавливаем ее на компонент JLabel
            ImageIcon imageIcon = new ImageIcon(imagePath);
            label.setIcon(imageIcon);
        } else {
            // Если файл не существует, выводим сообщение об ошибке
            label.setText("Файл не найден: " + imagePath);
        }

        // Добавляем компонент JLabel на окно
        frame.getContentPane().add(label);

        // Устанавливаем размеры окна и операцию закрытия
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Отображаем окно
        frame.setVisible(true);
    }
}
