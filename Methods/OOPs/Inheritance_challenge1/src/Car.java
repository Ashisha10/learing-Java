public class Car extends Vehicle{
    private int  wheels;
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;

    public Car(int wheels, int doors, int gears, boolean isManual) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear: changed to: " + this.currentGear + " gear.");
    }

}
