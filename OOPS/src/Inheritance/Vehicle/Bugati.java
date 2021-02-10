package Inheritance.Vehicle;



public class Bugati extends Car {

    private int RoadServiceMonth;

    public Bugati(int roadServiceMonth) {
        super("Bugati","4WD", 4, 4, 6, false);
        this.RoadServiceMonth = roadServiceMonth;
    }

    public void Accelerate (int Rate) {

        int NewVelocity = getCurrentVelocity() + Rate;
        if(NewVelocity == 0 ) {
            Stop();
            ChangeGear(1);
        }
        else if (NewVelocity > 0 && NewVelocity <= 10) {
            ChangeGear(1);
        }
        else if (NewVelocity > 10 && NewVelocity <= 20) {
            ChangeGear(2);
        }
        else if (NewVelocity > 20 && NewVelocity <= 30) {
            ChangeGear(3);
        }
        else if (NewVelocity > 30 && NewVelocity <= 40) {
            ChangeGear(4);
        }
        else {
            ChangeGear(5);
        }
        if (NewVelocity > 0 ) {
            ChangeVelocity(NewVelocity,getCurrentDirection());
        }

    }
}
