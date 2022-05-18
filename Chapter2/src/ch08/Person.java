package ch08;

public class Person {

    String personName;
    String personGender;
    String personAge;
    String personHeight;
    String personWeight;

    public Person(String personName, String personAge, String personGender){

        this.personName = personName;
        this.personAge = personAge;
        this.personGender = personGender;
    }

    public void setPersonHeight(String personHeight) {
        this.personHeight = personHeight;
    }

    public void setPersonWeight(String personWeight) {
        this.personWeight = personWeight;
    }

    public String  showPersonInfo() {
        return "Name : " + personName + ", Age : " + personAge + ", Gender : " + personGender + ", Height : " + personHeight
                + ", Weight : " + personWeight;
    }
}
