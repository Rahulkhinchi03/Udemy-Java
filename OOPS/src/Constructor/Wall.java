package Constructor;

public class Wall {

    public static void main(String[] args) {


        Wall wall = new Wall(4,5);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
    // Instance Variables
    private  double height;
    private double width;

// Getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

// Setters
    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0.00;
        }
        else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if(width < 0 ) {
            this.width = 0.00;
        }
        else {
            this.width = width;
        }
    }

//Area
    public  double getArea() {
        return getHeight() * getWidth();
    }




// Constructor1

   public Wall(){
        System.out.println("Hello Wall");
    }

// Constructor2

   public Wall(double height, double width) {

        if(height < 0 && width > 0 ) {
            this.width = width;
            this.height = 0.00;
        }
        else if (height > 0 && width < 0) {
            this.height = height;
            this.width = 0.00;
        }
        else if (width < 0 && height < 0) {
            this.width = 0.00;
            this.height = 0.00;
        }
        else{
            this.width = width;
            this.height = height;
        }
    }
}







