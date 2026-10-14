//FIXME
//фигурные скобки в одной строке
//методы в паскаль кейс
//убрали ошибку валидации
//package ru.denisov.transport;
//
//import java.util.Map;
//
//public final class TwoWayCity extends City { //двусторонняя дорога
//
//    public TwoWayCity(String name) {
//        super(name);
//    }
//
//    public TwoWayCity(String name, Map<City, Integer> initial) {
//        super(name, initial);
//    }
//
//    @Override
//    public void addConnection(City to, int cost) {
//        super.addConnection(to, cost);
//        try {
//            to.addConnection(this, cost);
//        } catch (IllegalStateException | IllegalArgumentException e) {}
//    }
//}

//FIXDO:
package ru.denisov.transport;

import java.util.Map;

public final class TwoWayCity extends City {

    public TwoWayCity(String name) {
        super(name);
    }

    public TwoWayCity(String name, Map<City, Integer> initial) {
        super(name, initial);
    }

    @Override
    public void AddConnection(City to, int cost) {
        super.AddConnection(to, cost);
        try {
            to.AddConnection(this, cost);
        } catch (IllegalStateException e) {
        }
    }
}