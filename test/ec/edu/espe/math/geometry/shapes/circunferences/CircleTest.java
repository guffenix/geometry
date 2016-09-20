
package ec.edu.espe.math.geometry.shapes.circunferences;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cazaesclavas
 */
public class CircleTest {
    
    public CircleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of perimeter method, of class Circle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Circle instance = new Circle(5f);
        Float expResult = (float)(Math.PI * 2 * 5);
        Float result = instance.perimeter();
        assertEquals(expResult, result);

    }

    /**
     * Test of area method, of class Circle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circle instance = new Circle(5f);
        Float expResult = (float)(Math.PI * 25);
        Float result = instance.area();
        assertEquals(expResult, result);

    }
    
}
