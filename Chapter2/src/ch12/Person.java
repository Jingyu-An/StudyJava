package ch12;

public class Person {

    String name;
    int age;

    public Person() {

        this("No Nmae", 0);
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void showPerson() {

        System.out.println("Name : " + name + ", Age :" + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        System.out.println(person.getPerson());
    }
}
