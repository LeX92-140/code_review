//FIXME
//методы в паскаль кейс
//геттеры должны возвращать копии
//проверка на совпадение точек
//package ru.denisov.geometry;
//
//public class Line { //Линия между двумя точками
//    private Point start;
//    private Point end;
//
//    public Line(Point start, Point end) {
//        if (start == null || end == null) {
//            throw new IllegalArgumentException("начало и конец должны быть не null");
//        }
//        this.start = start;
//        this.end = end;
//    }
//
//    public Point getStart() {
//        return start;
//    }
//
//    public void setStart(Point start) {
//        if (start == null) {
//            throw new IllegalArgumentException("начало не может быть null");
//        }
//        this.start = start;
//    }
//
//    public Point getEnd() {
//        return end;
//    }
//
//    public void setEnd(Point end) {
//        if (end == null) {
//            throw new IllegalArgumentException("конец не может быть null");
//        }
//        this.end = end;
//    }
//
//    @Override
//    public String toString() {
//        return "Линия от " + start + " до " + end;
//    }
//}

//FIXDO
package ru.denisov.geometry;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("начало и конец должны быть не null");
        }
        if (start.equals(end)) {
            throw new IllegalArgumentException("Точки не могут совпадать");
        }
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Point GetStart() {
        return new Point(start);
    }

    public void SetStart(Point start) {
        if (start == null) {
            throw new IllegalArgumentException("начало не может быть null");
        }
        if (start.equals(this.end)) {
            throw new IllegalArgumentException("Начальная точка не может совпадать с конечной");
        }
        this.start = new Point(start);
    }

    public Point GetEnd() {
        return new Point(end);
    }

    public void SetEnd(Point end) {
        if (end == null) {
            throw new IllegalArgumentException("конец не может быть null");
        }
        if (end.equals(this.start)) {
            throw new IllegalArgumentException("Конечная точка не может совпадать с начальной");
        }
        this.end = new Point(end);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}