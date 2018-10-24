public abstract class Figure {
    double width;
    String colour;

    public void setColour(String colour)  {
        this.colour = colour;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public String getColour() {
        return colour;
    }

    public double square () throws GeometricException {
        return 0;
    }
    public double perimetr  (){
        return 0;
    }
}
