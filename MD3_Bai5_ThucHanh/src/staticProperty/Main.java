package staticProperty;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car("VP","VF6");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("VP", "VP8");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("VP", "VP10");
        System.out.println(Car.numberOfCars);
    }
}
