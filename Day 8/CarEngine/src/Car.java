public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheel;

    public Car(boolean engine, int cylinders, String name, int wheel) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.name = name;
        this.wheel = wheel;
    }

    public Car(int cylinders, String name) {
    }

    public String startEngine(){
        String classInstance = this.getClass().getSimpleName();
        return classInstance + "-> engine is starting";
    }

    public String accelerate(){
        String classInstance  = this.getClass().getSimpleName();
        return classInstance + "-> accelerating";
    }

    public String brake(){
        String classInstance = this.getClass().getSimpleName();
        return classInstance + "-> car is braking";
    }

    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
