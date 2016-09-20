
package ec.edu.espe.math.geometry.solids.cubes;

import ec.edu.espe.math.geometry.shapes.quadrilaterals.Square;

/**
 *
 * @author Cazaesclavas
 */
public class Cube extends Square implements CubeSolidInterface{

    public Cube(Float side) {
        super(side);
    }

    
    @Override
    public Float volume() {
        return (float)(Math.pow(this.side, 3));
    }
    
}
