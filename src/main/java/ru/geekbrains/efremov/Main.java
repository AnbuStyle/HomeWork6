package ru.geekbrains.efremov;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька",200,0);
        Dog dog = new Dog ("Геннадий", 100, 10);

        cat.swimming();
        cat.running(300);
        cat.infoAnimals();

        dog.swimming(11);
        dog.running(500);
        dog.infoAnimals();

    }
}