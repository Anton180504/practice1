package prac9;

import java.util.ArrayList;
import java.util.List;

// Класс Employee представляет сотрудника с именем и зарплатой.
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class MergeSortEmployees {
    public static void main(String[] args) {
        // Создаем два списка сотрудников.
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee("Alice", 50000.0));
        list1.add(new Employee("Bob", 60000.0));
        list1.add(new Employee("Charlie", 55000.0));

        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("David", 52000.0));
        list2.add(new Employee("Eva", 58000.0));

        // Вызываем метод mergeSort для слияния и сортировки списков.
        List<Employee> mergedList = mergeSort(list1, list2);

        // Выводим отсортированный список сотрудников на консоль.
        System.out.println("Merged and sorted list:");
        for (Employee employee : mergedList) {
            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }

    // Метод для сортировки и слияния двух списков сотрудников.
    static List<Employee> mergeSort(List<Employee> list1, List<Employee> list2) {
        List<Employee> result = new ArrayList<>();
        int i = 0, j = 0;

        // Пока есть элементы в обоих списках, сравниваем и добавляем минимальный в результат.
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getSalary() >= list2.get(j).getSalary()) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся элементы из list1 (если есть).
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        // Добавляем оставшиеся элементы из list2 (если есть).
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }
}
