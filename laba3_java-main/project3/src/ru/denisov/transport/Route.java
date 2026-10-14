//FIXME
//методы паскалькейс
//понятные переменные
//гетпас делал несколько задач, разбили
//package ru.denisov.transport;
//
//import java.util.*;
//
//public class Route { //Маршрут между двумя городами
//    private City start;
//    private City end;
//
//    public Route(City start, City end) {
//        if (start == null || end == null) {
//            throw new IllegalArgumentException("Начало и конец должны быть указаны");
//        }
//        this.start = start;
//        this.end = end;
//    }
//
//    public City getStart() {
//        return start;
//    }
//
//    public void setStart(City start) {
//        if (start == null) throw new IllegalArgumentException("Начало не может быть null");
//        this.start = start;
//    }
//
//    public City getEnd() {
//        return end;
//    }
//
//    public void setEnd(City end) {
//        if (end == null) throw new IllegalArgumentException("Конец не может быть null");
//        this.end = end;
//    }
//
//    public City[] getPath() { //возвращает массив городов от start до end
//        if (start.equals(end)) {
//            return new City[] { start };
//        }
//        Queue<City> q = new ArrayDeque<>();
//        Map<City, City> prev = new HashMap<>(); //для восстановления пути
//        Set<City> visited = new HashSet<>();
//
//        q.add(start);
//        visited.add(start);
//
//        while (!q.isEmpty()) { //BFS на основе исходящих связей
//            City cur = q.poll();
//            for (City neighbor : cur.getConnections().keySet()) {
//                if (!visited.contains(neighbor)) {
//                    visited.add(neighbor);
//                    prev.put(neighbor, cur);
//                    if (neighbor.equals(end)) {
//                        // восстанавливаем путь
//                        List<City> path = new ArrayList<>();
//                        City step = neighbor;
//                        while (step != null) {
//                            path.add(step);
//                            step = prev.get(step);
//                        }
//                        Collections.reverse(path);
//                        return path.toArray(new City[0]);
//                    }
//                    q.add(neighbor);
//                }
//            }
//        }
//        return new City[0];
//    }
//
//    @Override
//    public String toString() {
//        City[] path = getPath();
//        if (path.length == 0) return "(пути нет)";
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < path.length; i++) {
//            if (i > 0) sb.append(" - ");
//            sb.append(path[i].getName());
//        }
//        return sb.toString();
//    }
//}

//FIXDO:
package ru.denisov.transport;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Route {
    private City start;
    private City end;

    public Route(City start, City end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Начало и конец должны быть указаны");
        }
        this.start = start;
        this.end = end;
    }

    public City GetStart() {
        return start;
    }

    public void SetStart(City start) {
        if (start == null) {
            throw new IllegalArgumentException("Начало не может быть null");
        }
        this.start = start;
    }

    public City GetEnd() {
        return end;
    }

    public void SetEnd(City end) {
        if (end == null) {
            throw new IllegalArgumentException("Конец не может быть null");
        }
        this.end = end;
    }

    public City[] GetPath() {
        if (start.equals(end)) {
            return new City[] { start };
        }
        Map<City, City> previous = new HashMap<>();
        City found = FindPath(previous);
        if (found == null) {
            return new City[0];
        }
        return ReconstructPath(previous, found);
    }

    private City FindPath(Map<City, City> previous) {
        Queue<City> queue = new ArrayDeque<>();
        Set<City> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            City current = queue.poll();
            for (City neighbor : current.GetConnections().keySet()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    previous.put(neighbor, current);
                    if (neighbor.equals(end)) {
                        return neighbor;
                    }
                    queue.add(neighbor);
                }
            }
        }
        return null;
    }

    private City[] ReconstructPath(Map<City, City> previous, City found) {
        List<City> path = new ArrayList<>();
        City step = found;
        while (step != null) {
            path.add(step);
            step = previous.get(step);
        }
        Collections.reverse(path);
        return path.toArray(new City[0]);
    }

    @Override
    public String toString() {
        City[] path = GetPath();
        if (path.length == 0) {
            return "(пути нет)";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.length; i++) {
            if (i > 0) {
                sb.append(" - ");
            }
            sb.append(path[i].GetName());
        }
        return sb.toString();
    }
}