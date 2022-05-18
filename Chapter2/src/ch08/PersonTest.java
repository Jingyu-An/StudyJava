package ch08;

public class PersonTest {

    public static void main(String[] args) {

        Person personTomas = new Person("Tomas", "37", "Man");

        personTomas.setPersonHeight("180cm");
        personTomas.setPersonWeight("77Kg");

        System.out.println(personTomas.showPersonInfo());
    }
}
