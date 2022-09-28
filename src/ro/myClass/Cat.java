package ro.myClass;

import javax.print.DocFlavor;

public class Cat implements Animals {
    private Person person;
    private String name;

    public Cat(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Meow meow");

    }

    @Override
    public Animals clone() {
        Person person1 = this.person;
        String name = this.name;
        Cat cat = new Cat(person1,name);
        return cat;
    }

    @Override
    public void describe() {
        System.out.println("Meoww!My name is"+ name + " I'm a cat and my owner is " + person.getFirstName() + "  " + person.getLastName());

    }
    @Override
    public String toString(){
        return person+","+name;
    }
    @Override
    public boolean equals(Object obj){
        Cat cat = (Cat) obj;
        return this.person.equals(cat.person);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
