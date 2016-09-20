
package ec.edu.espe.main;

import ec.edu.espe.math.geometry.quadrilaterals.Rectangle;
import ec.edu.espe.math.geometry.quadrilaterals.Square;
import ec.edu.espe.util.GeometricConstants;
import ec.edu.espe.util.PrinterUtil;

/**
 *
 * @author Cazaesclavas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square square = new Square(5f);
        
        PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.PERIMETER, square.perimeter().toString());
        PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.AREA, square.area().toString());
        
        Rectangle rectangle = new Rectangle(5f,3f);
        PrinterUtil.printShape(rectangle.getClass().getSimpleName(), GeometricConstants.PERIMETER, rectangle.perimeter().toString());
        PrinterUtil.printShape(rectangle.getClass().getSimpleName(), GeometricConstants.AREA, rectangle.area().toString());
    }
    
}
