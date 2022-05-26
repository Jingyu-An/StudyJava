package ch19;

public class CarFactoryTest {

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();

        Car myJeep = factory.createCar();
        Car yourJeep = factory.createCar();

        System.out.println(myJeep.getCarNum());
        System.out.println(yourJeep.getCarNum());
    }
}
