public class Main {
    public static void main(String[] args) {

        Car car = new Car("1970 Red Ferrari 570 gt");
        runRace(car);
        Car ferrari = new GasPoweredCar("1970 Red Ferrari 570 gt", 15.4, 6);
        runRace((ferrari));

        Car tesla = new ElectricCar("White tesla model 3");
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Red ferrari hybrid", 16.00,5,8);
    runRace(ferrariHybrid);
    }
    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }


}