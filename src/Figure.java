public abstract class Figure{
    private double width;
    private String color;

    public void setColor(String color)  {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public double square () throws GeometricException {
        return 0;
    }
    public double perimeter(){
        return 0;
    }
}
