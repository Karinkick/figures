package my.figures;

public class GeometricException extends Exception{

    public GeometricException (String message) {
    super(message);
    }
    public GeometricException(){

    }

        @Override
    public String toString() {
        return "my.figures.GeometricException!" ;
    }
}

