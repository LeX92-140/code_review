//FIXME
//методы в паскаль кейс
//добавлена валидация
//добавлен конструктор копирования и проверки
//private перемещен в конец
//package ru.denisov.geometry;
//
//public class Point { //Инкапсуляция приватные поля геттеры сеттеры.
//    private double x;
//    private double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public Point() {
//        this(0.0, 0.0);
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    @Override
//    public String toString() {
//        return "{" + trim(x) + ";" + trim(y) + "}";
//    }
//
//    private String trim(double v) {
//        if (v == (long) v) {
//            return String.format("%d", (long) v);
//        }
//        return String.format("%s", v);
//    }
//}

//FIXDO
package ru.denisov.geometry;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        if (Double.isNaN(x) || Double.isNaN(y)) {
            throw new IllegalArgumentException("Координаты не могут быть NaN");
        }
        if (Double.isInfinite(x) || Double.isInfinite(y)) {
            throw new IllegalArgumentException("Координаты не могут быть бесконечными");
        }
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0.0, 0.0);
    }

    public Point(Point other) {
        if (other == null) {
            throw new IllegalArgumentException("Точка для копирования не может быть null");
        }
        this.x = other.x;
        this.y = other.y;
    }

    public double GetX() {
        return x;
    }

    public void SetX(double x) {
        if (Double.isNaN(x) || Double.isInfinite(x)) {
            throw new IllegalArgumentException("Некорректное значение координаты X");
        }
        this.x = x;
    }

    public double GetY() {
        return y;
    }

    public void SetY(double y) {
        if (Double.isNaN(y) || Double.isInfinite(y)) {
            throw new IllegalArgumentException("Некорректное значение координаты Y");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + Trim(x) + ";" + Trim(y) + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    private String Trim(double v) {
        if (v == (long) v) {
            return String.format("%d", (long) v);
        }
        return String.format("%s", v);
    }
}
