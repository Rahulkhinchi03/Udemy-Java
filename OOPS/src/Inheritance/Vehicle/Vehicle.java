package Inheritance.Vehicle;

public class Vehicle {
    public static void main(String[] args) {
        Bugati Bugati = new Bugati(36);
        Bugati.Accelerate(25);
        Bugati.Accelerate(37);
        Bugati.Steer(60);
        Bugati.Accelerate(-31);
    }

    private String Name;
    private String size;

    private int CurrentVelocity;
    private int CurrentDirection;

    public Vehicle(String name, String size) {
        Name = name;
        this.size = size;
        this.CurrentVelocity = 0;
        this.CurrentDirection = 0;
    }

    public void Steer (int direction) {
        this.CurrentDirection += direction;
        System.out.println(" Car.Steer(): is moving at " + direction + " degree.");
    }
    public void Move ( int velocity, int direction) {
        CurrentVelocity = velocity;
        CurrentDirection = direction;
        System.out.println("Vehicle.Move(): is moving with the Speed of " +
                CurrentVelocity + " and in " + CurrentDirection + " Direction.");
    }

    public String getName() {
        return Name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return CurrentVelocity;
    }

    public int getCurrentDirection() {
        return CurrentDirection;
    }

    public void Stop() {
        this.CurrentVelocity = 0;
    }
}
