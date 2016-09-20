
package ec.edu.espe.math.geometry.solids.cylinders;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import ec.edu.espe.math.geometry.solids.circunferences.CircunferenceSolidInterface;

/**
 *
 * @author Cazaesclavas
 */
public class Cylinder  extends Circunference implements CircunferenceSolidInterface{

    private Float height;

    public Cylinder(Float height,Float radio) {
        this.height = height;
        this.radio = radio;
    }
    
    
    
    @Override
    public Float perimeter() {
        throw new UnsupportedOperationException("Impossible"); 
    }

    @Override
    public Float area() {
        return (float)(Math.PI*2*this.radio*this.height);
    }

    @Override
    public Float volume() {
        return (float)(Math.PI* Math.pow(this.radio, 2)*this.height);
    }
    
}
