
package ec.edu.espe;

import math.geometry.quadrilaterals.Square;
import util.GeometricConstants;
import util.PrinterUtil;

/**
 *
 * @author Labs-DECC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square square = new Square(5f);
        
        PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.PERIMETER, square.perimeter().toString());
        PrinterUtil.printShape(square.getClass().getSimpleName(), GeometricConstants.AREA, square.area().toString());
    }
    
}
