package ch14;

public class Subway {

    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println("Passenger number of subway" + lineNumber + " is " + passengerCount + ", and income is " + money + ".");
    }
}
