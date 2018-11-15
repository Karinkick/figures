import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Lab1Test {

    @Test
    void main()  throws GeometricException {

        ArrayList points1 = new ArrayList();

        Point p1 = new Point(3.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        assertNotEquals(p1,p2);
        Point p3 = new Point(3.0, 5.0);
        Point p4 = new Point(5.0, 5.0);
        Point p5 = new Point(6.0, 8.0);
        Point p6 = new Point(7.0, 8.0);
        Point p7 = new Point(7.0, 9.0);
        Point p8 = new Point(7.0, 10.0);
        Point p9 = new Point(2.0, 2.0);
        Point p10 = new Point(3.0, 1.0);

        Section o1 = new Section(p1,p2);
        assertEquals("((3.0; 2.0); (3.0; 4.0))",o1.toString());

        ZamMnog za1 = new ZamMnog(points1);
        try{
            za1.AddPoint(p1);
            za1.AddPoint(p2);
            za1.AddPoint(p3);
            za1.AddPoint(p4);
            za1.AddPoint(p4);
            assertEquals("(3.0; 2.0) (3.0; 4.0) (3.0; 5.0) (5.0; 5.0) (6.0; 8.0) ",za1.toString());
            za1.DeletePoint(p1);
            assertEquals("(3.0; 4.0) (3.0; 5.0) (5.0; 5.0) (6.0; 8.0) ",za1.toString());
            }
        catch(GeometricException e){
            System.out.println(e.getMessage());
        }

        assertEquals(3,za1.square());

        assertEquals(8.60555127546399,za1.perimeter());
    }
}