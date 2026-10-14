//FIXME
//методы в паскаль кейс
//валидация
//package ru.denisov.geometry;
//
//public final class Point3D extends Point implements Cloneable { //Трехмерная точка. Подкласс Point. Реализует клонирование (возвращает новый объект с копией координат).
//    private double z;
//
//    public Point3D(double x, double y, double z) {
//        super(x, y);
//        this.z = z;
//    }
//
//    public Point3D() {
//        this(0.0, 0.0, 0.0);
//    }
//
//    public double getZ() {
//        return z;
//    }
//
//    public void setZ(double z) {
//        this.z = z;
//    }
//
//    @Override
//    public Point3D clone() { // возвращаем новую независимую точку
//        return new Point3D(getX(), getY(), z);
//    }
//
//    @Override
//    public String toString() {
//        return "{" + getX() + ";" + getY() + ";" + z + "}";
//    }
//}

//FIXDO
package ru.denisov.geometry;

import java.util.Objects;

public final class Point3D extends Point implements Cloneable {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        if (Double.isNaN(z) || Double.isInfinite(z)) {
            throw new IllegalArgumentException("Координата Z не может быть NaN или бесконечной");
        }
        this.z = z;
    }

    public Point3D() {
        this(0.0, 0.0, 0.0);
    }

    public double GetZ() {
        return z;
    }

    public void SetZ(double z) {
        if (Double.isNaN(z) || Double.isInfinite(z)) {
            throw new IllegalArgumentException("Координата Z не может быть NaN или бесконечной");
        }
        this.z = z;
    }

    @Override
    public Point3D clone() {
        return new Point3D(GetX(), GetY(), z);
    }

    @Override
    public String toString() {
        return "{" + GetX() + ";" + GetY() + ";" + z + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Point3D other = (Point3D) obj;
        return Double.compare(z, other.z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}