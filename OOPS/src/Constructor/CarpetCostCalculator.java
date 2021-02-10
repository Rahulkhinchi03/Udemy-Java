package Constructor;

public class CarpetCostCalculator {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }

    public static class Floor {


// Instance Variable
        private double length;
        private double width;

        public Floor(double length, double width) {

            if(width < 0 && length > 0) {
                this.length = length;
                this.width = 0.00;
            }
            else if (width > 0 && length < 0 ) {
                this.length = 0.00;
                this.width = width;
            }
            else if (width < 0 && length < 0) {
                this.length = 0.00;
                this.width = 0.00;
            }
            else{
                this.width = width;
                this.length = length;
            }
        }

        public double getArea () {
            return this.width * this.length;
        }
    }
    public static class Carpet{

       private double cost;

        public Carpet(double cost) {

            if(cost < 0 ) {
                this.cost = 0.00;
            }
            else {
                this.cost = cost;
            }
        }
    public double getCost(){
            return this.cost;
    }


    }

    public static class Calculator {
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }
        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
    }
}
