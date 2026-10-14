//FIXME
//метод в паскаль кейс
//package ru.denisov.birds;
//
//import java.util.concurrent.ThreadLocalRandom;
//
//public class Parrot extends Bird { //Попугай хранит текст при пении выводит первые n символов
//    private final String text;
//
//    public Parrot(String text) {
//        super("Parrot");
//        if (text == null || text.isEmpty()) {
//            throw new IllegalArgumentException("Попугаю надо че то сказать");
//        }
//        this.text = text;
//    }
//
//    @Override
//    public void sing() {
//        int n = ThreadLocalRandom.current().nextInt(1, text.length() + 1);
//        System.out.println(text.substring(0, n));
//    }
//}

//FIXDO
package ru.denisov.birds;

import java.util.concurrent.ThreadLocalRandom;

public class Parrot extends Bird {
    private final String text;

    public Parrot(String text) {
        super("Parrot");
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Попугаю надо че то сказать");
        }
        this.text = text;
    }

    @Override
    public void Sing() {
        int n = ThreadLocalRandom.current().nextInt(1, text.length() + 1);
        System.out.println(text.substring(0, n));
    }
}