package Inheritance.Vehicle;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int CurrentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        CurrentGear = 1;
    }

    public void ChangeGear(int currentGear) {
        this.CurrentGear = currentGear;
        System.out.println(" CurrentGear changed to " + this.CurrentGear + " gear.");
    }

    public void ChangeVelocity ( int speed, int direction) {
        System.out.println("Car.ChangeVelocity(): Velocity " + speed + " Direction " + direction);
        Move(speed, direction);
    }
}
