public class Main {
    public static void main(String[] args) {
        Car car = new Car("Гранта",4);
        Truck truck = new Truck("Камаз",8);
        Bicycle bicycle = new Bicycle("Урал", 2);


        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);


    }


}