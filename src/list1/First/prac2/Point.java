package list1.First.prac2;

// Класс точки на плоскости
class Point {
    private double x; // Координата x точки
    private double y; // Координата y точки

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Класс окружности
class Circle {
    private Point center; // Поле для хранения центра окружности (объект типа Point)
    private double radius; // Радиус окружности

    public Circle(Point center, double radius) {
        this.center = center; // Инициализируем центр окружности объектом Point
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
}

// Класс Tester для тестирования
class Tester {
    public static void main(String[] args) {
        // Создаем объекты Point для центров окружностей
        Point center1 = new Point(1.0, 2.0); // Создаем точку (1.0, 2.0)
        Point center2 = new Point(3.0, 4.0); // Создаем точку (3.0, 4.0)

        // Создаем объекты Circle с использованием объектов Point в качестве центров
        Circle circle1 = new Circle(center1, 5.0); // Окружность с центром в точке center1 и радиусом 5.0
        Circle circle2 = new Circle(center2, 3.0); // Окружность с центром в точке center2 и радиусом 3.0

        // Создаем массив объектов Circle
        Circle[] circles = {circle1, circle2};

        // Выводим информацию о окружностях
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Окружность " + (i + 1));
            System.out.println("Центр: (" + circles[i].getCenter().getX() + ", " + circles[i].getCenter().getY() + ")");
            System.out.println("Радиус: " + circles[i].getRadius());
            System.out.println();
        }

        // Выводим количество окружностей в массиве
        System.out.println("Количество окружностей в массиве: " + circles.length);
    }
}

