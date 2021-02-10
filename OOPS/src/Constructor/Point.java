package Constructor;

public class Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }

// Instance Variables
    private int x;
    private int y;

// Constructor1
    public Point() {

    }

// Constructor2
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

// Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

// Setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

// Sum

public double distance(){
        return Math.sqrt( (0 - this.getX()) * (0 - this.getX()) + (0 - this.getY()) * (0 - this.getY()) );

}

public double distance(int x, int y) {
         return  Math.sqrt( (x - this.getX()) * (x - this.getX()) + (y - this.getY()) * (y - this.getY()) );

}

public  double distance(Point second) {
        return Math.sqrt( (second.getX() - this.getX()) * (second.getX() - this.getX())
        + (second.getY() - this.getY()) * (second.getY() - this.getY()));

}
}
