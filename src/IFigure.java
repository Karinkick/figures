package my.figures;

public interface IFigure {
    public void addPoint(point p) throws GeometricException;

    public void deletePoint(point p);

}
