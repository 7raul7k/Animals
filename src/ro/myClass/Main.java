package ro.myClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Popescu","Alex",23);
        Person person1 = new Person("Ionescu","Dragos",29);
        Person person2 = new Person("Dumitrescu","Rares",23);
        Person person3 = new Person("Ursulescu","Eduard",24);
        Dog dog = new Dog(person,"Max");
        Dog dog1 = new Dog(person2,"Bailey");
        Cat cat1 = new Cat(person1,"Luna");
        Cat cat2 = new Cat(person3,"Kity");
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog1);
        animals.add(cat1);
        animals.add(cat2);
        Owners owners = new Owners(animals);
        owners.describe();
        owners.sound();
    }
}