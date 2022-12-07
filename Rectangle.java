public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length = 1;
        width = 1;
    }

    public double perimeter() {
        double x = 2 * (length + width);
        return x;
    }

    public double area(){
        double x = length * width; 
        return x;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLengthWidth(double newLength, double newWidth){
        this.length = newLength;
        this.width = newWidth;
    }

}
