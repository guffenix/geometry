/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.circunferences;

import ec.edu.espe.math.geometry.solids.cylinders.Cylinder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author incubus
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

    @Test
    public void testArea() {
        System.out.println("area");
        Circle instance = new Circle(5f);
        Float expResult = (float)(Math.PI * 25);
        Float result = instance.area();
        assertEquals(expResult, result);

    }
    
        @Test
    public void testVolumen() {
        System.out.println("Volumen");
        Cylinder instance = new Cylinder(2f,5f);
        Float expResult = (float) (Math.PI * 25 * 2);
        Float result = instance.volume();
        assertEquals(expResult, result);

    }
    @Test
    public void testNotEq() {
        System.out.println("Volumen no es igual");
        Cylinder instance = new Cylinder(2f,5f);
        Float expResult = 22f;//(float) (Math.PI * 25 * 2);
        Float result = instance.volume();
        assertNotSame(expResult, result);

    }
    
}
