
package ec.edu.espe.math.geometry.solids.circunferences;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import java.util.Objects;

/**
 *
 * @author Cazaesclavas
 */
public class Sphere extends Circunference implements CircunferenceSolidInterface{

    

    public Sphere(Float radio) {
        this.radio = radio;
    }
    
    @Override
    public Float perimeter() {
        return (float)(2 * Math.PI * this.radio);
    }

    @Override
    public Float area() {
        return (float)( Math.PI * Math.pow(this.radio, 2));
    }

    @Override
    public Float volume() {
        return (float)( (4/3)*Math.PI * Math.pow(this.radio, 3));
    }
    
}
