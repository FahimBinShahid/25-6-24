public class Car {
    private String description;
    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Csr-> startEngine");
    }

    public void runEngine(){
        System.out.println("Car-> runEngine");
    }

    public void drive(){
        System.out.println("Car-> driving, type is " + getClass().getSimpleName());
        runEngine();

    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders =6;

    public GasPoweredCar(String description){
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!%n", cylinders);
    }

    @Override
    public void runEngine() {
        System.out.printf("Gas-> usage exceeds the average: %.2f%n", avgKmPerLiter);
    }
}

class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize =6;

    public ElectricCar(String description){
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Gas-> usage exceeds the average: %.2f%n", avgKmPerCharge);
    }
}

class HybridCar extends Car{
    private double avgKmPerLiter;
    private int cylinders =6;
    private int batterySize;

    public HybridCar(String description){
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders
    ,int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up .%n" ,cylinders);
        System.out.printf("Hybrid -> %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    public void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n", avgKmPerLiter);
    }
}


