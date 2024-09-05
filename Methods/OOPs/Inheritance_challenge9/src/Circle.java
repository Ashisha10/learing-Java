public class Circle extends Shape{
    private int rad;
    public Circle(int givenRad) {
        this.rad = givenRad;
    }
    public double getArea() {
        return (double) (Math.PI*rad*rad);
    }
    public double getPeri() {
        return (double) (2*Math.PI*rad);
    }
}
