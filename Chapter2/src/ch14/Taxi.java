package ch14;

public class Taxi {

    String taxiCompany;
    int money;

    public Taxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showBusInfo() {
        System.out.println("Income of " + taxiCompany + " taxi is " + money + ".");
    }
}
