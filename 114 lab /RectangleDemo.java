public class RectangleDemo {
    private double width = 1.0, height = 1.0;
    private static String color = "white";

    public RectangleDemo() { //constructor without args

    }

    public RectangleDemo(double width, double height) { //w args
        this.width = width;
        this.height = height;
    }

    public void setWidth(double newWidth) { this.width = newWidth; }
    public void setHeight(double newHeight) { this.height = newHeight; }
    public void setColor(String newColor) { this.color = newColor; }

    public double getWidth() { return this.width; }
    public double getHeith() { return this.height; }
    public String getColor() { return this.color; }

    public double getArea() { return this.width*this.height;}
    public double getPerimeter() { return (this.width+this.height)*2; }

    public static void main(String[] args) {
        RectangleDemo rect1 = new RectangleDemo(4, 40);
        RectangleDemo rect2 = new RectangleDemo(3.5, 35.9);
        System.out.println("Rect1 width: " + rect1.getWidth());
        System.out.println("Rect1 height: " + rect1.getHeith());
        System.out.println("Rect1 color " + rect1.getColor());

        System.out.println("Rect2 width: " + rect2.getWidth());
        System.out.println("Rect2 height: " + rect2.getHeith());
        System.out.println("Rect2 color " + rect2.getColor());

        rect1.setColor("Red");
        System.out.println("Rect1 color: " + rect1.getColor());
        System.out.println("Rect2 color: " + rect2.getColor());
        System.out.println("Rect1 area: " + rect1.getArea());
        System.out.println("Rect1 perimter: " + rect1.getPerimeter());
    }
    
}
