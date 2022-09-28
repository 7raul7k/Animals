package ro.myClass;

public class Dog implements Animals{
    Person person;
    private String name;

    public Dog(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Bark bark");
    }

    @Override
    public Animals clone() {
       Person person1 = this.person;
       String name = this.name;
       Dog dog = new Dog(person1,name);
       return dog;
    }

    @Override
    public void describe() {
        System.out.println("Woof woof!My name is " + name+ " I'm a dog and my owner is " + person.getFirstName() + " " + person.getLastName());
    }
    @Override
    public String toString(){
        return person+","+name;
    }
    @Override
    public boolean equals(Object obj){
        Dog dog = (Dog) obj;
        return this.person.equals(((Dog) obj).person);
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
