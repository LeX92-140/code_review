//FIXME
//методы в паскаль кейс
//package ru.denisov.birds;
//
//public abstract class Bird { //корень иерархии птиц
//    private final String species;
//
//    protected Bird(String species) {
//        if (species == null || species.isEmpty()) {
//            throw new IllegalArgumentException("Вид не может быть null");
//        }
//        this.species = species;
//    }
//
//    public String getSpecies() {
//        return species;
//    }
//
//    public abstract void sing(); //петь
//}

//FIXDO
package ru.denisov.birds;

public abstract class Bird {
    private final String species;

    protected Bird(String species) {
        if (species == null || species.isEmpty()) {
            throw new IllegalArgumentException("Вид не может быть null");
        }
        this.species = species;
    }

    public String GetSpecies() {
        return species;
    }

    public abstract void Sing();
}