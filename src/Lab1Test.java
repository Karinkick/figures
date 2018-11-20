package my.figures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Lab1Test {

    point p1 = new point(3.0, 2.0);
    point p2 = new point(3.0, 4.0);
    point p3 = new point(3.0, 5.0);
    point p4 = new point(5.0, 5.0);
    point p5 = new point(6.0, 8.0);

    Section o1 = new Section(p1,p2);

    ArrayList points1 = new ArrayList();
    ArrayList points2 = new ArrayList();

    ZamMnog za1 = new ZamMnog(points1);

    @Test
    void main() throws GeometricException {
        assertNotEquals(p1, p2);
        assertEquals("(3.0; 2.0)", p1.toString());

        assertEquals("((3.0; 2.0); (3.0; 4.0))",o1.toString());



        za1.addPoint(p1);
        za1.addPoint(p2);
        za1.addPoint(p3);
        za1.addPoint(p4);
        za1.addPoint(p5);
        assertThrows(GeometricException.class, ()-> {
                    za1.addPoint(new point(p3.getX(), p3.getY())
                    );
                }
        );




        assertEquals("(3.0; 2.0) (3.0; 4.0) (3.0; 5.0) (5.0; 5.0) (6.0; 8.0) ",za1.toString());
        assertEquals(1.5,za1.square());
        assertEquals(14.87048159266775,za1.perimeter());

        System.out.println("До удаления:" + za1.toString());
        za1.deletePoint(p5);
        assertEquals("(3.0; 2.0) (3.0; 4.0) (3.0; 5.0) (5.0; 5.0) ",za1.toString());
        System.out.println("После удаления:" + za1.toString());

    }
    @Test
    public void testSquare() throws GeometricException
    {
        try {
            System.out.println(o1.square());
        }

        catch (GeometricException e){
            System.out.println("Нельзя вычислить площадь отрезка " + e) ;
        }
    }



}