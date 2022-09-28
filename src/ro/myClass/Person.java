package ro.myClass;

public class Person implements Animals{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public void sound() {
        System.out.println("Im a human");
    }

    @Override
    public Animals clone() {
        String lastname = this.lastName;
        String firstname = this.firstName;
        int age = this.age;
        Person person = new Person(firstName,lastName,age);
        return person;

    }

    @Override
    public void describe() {
        System.out.println("My name is " + firstName + " " + lastName + " and I'm " + age + " years old ");
    }
    @Override
    public String toString(){
        return firstName+","+lastName+","+age;
    }
    @Override
    public boolean equals(Object obj){
        Person m = (Person) obj;
        if(this.firstName.equals(m.firstName) && this.lastName.equals(m.lastName) && this.age == m.age){
            return true;
        }
        return false;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
