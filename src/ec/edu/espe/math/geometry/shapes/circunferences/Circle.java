
package ec.edu.espe.math.geometry.shapes.circunferences;

/**
 *
 * @author Cazaesclavas
 */
public class Circle extends Circunference{

    public Circle(Float radio) {
        this.radio = radio;
    }

    
    @Override
    public Float perimeter() {
        return (float)(Math.PI * 2 * this.radio);
    }

    @Override
    public Float area() {
        return (float)(Math.PI * Math.pow(this.radio, 2));
    }
    
}
