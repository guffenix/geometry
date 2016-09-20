
package ec.edu.espe.math.geometry.shapes.triangles;

/**
 *
 * @author Cazaesclavas
 */
public class RightAngleTriangle extends Triangle{

    private Float base;
    private Float height;
    
    public  RightAngleTriangle(Float base, Float height)
    {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public Float perimeter() {
        return (float)(Math.sqrt(Math.pow(this.base, 2)+ Math.pow(this.height, 2))+this.base+this.height);
    }

    @Override
    public Float area() {
        return (this.base * this.height)/2;
    }

    public Float getBase() {
        return base;
    }

    public void setBase(Float base) {
        this.base = base;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
    
}
