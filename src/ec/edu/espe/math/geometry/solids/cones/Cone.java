
package ec.edu.espe.math.geometry.solids.cones;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import ec.edu.espe.math.geometry.solids.circunferences.CircunferenceSolidInterface;

/**
 *
 * @author Cazaesclavas
 */
public class Cone  extends Circunference implements CircunferenceSolidInterface{

    private Float height;
    @Override
    public Float perimeter() {
        throw new UnsupportedOperationException("Impossible"); 
    }

    @Override
    public Float area() {
        return (float)(Math.PI*this.radio*Math.sqrt(Math.pow(this.radio, 2)+Math.pow(this.height, 2)));
    }

    @Override
    public Float volume() {
        return (float)((1/3)*Math.PI* Math.pow(this.radio, 2)*this.height);
    }
    
}
