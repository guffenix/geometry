
package ec.edu.espe.math.geometry.triangles;

/**
 *
 * @author Cazaesclavas
 */
public class ObtuseAngleTriangle extends RightAngleTriangle{

    public ObtuseAngleTriangle(Float base, Float height) {
        super(base, height);
    }

    
    @Override
    public Float perimeter() {
        return (this.getBase()+this.getHeight()+(float)(Math.sqrt(Math.pow(this.getBase(), 2)+Math.pow(this.getHeight(), 2))));
    }

    @Override
    public Float area() {
        return (this.getBase()*this.getHeight())/2;
    }
}
