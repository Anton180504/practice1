package list1.First;

public class ComandString {
    public static void main(String[] args) {
        // Перебор аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}
