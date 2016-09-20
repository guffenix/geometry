package math.geometry.triangles;

/**
 *
 * @author Cazaesclavas
 */
public class ScaleneTriangle extends Triangle{

    
    
    @Override
    public Float perimeter() {
        return this.getSideOne() + this.getSideTwo() + this.getSideThree();
    }

    @Override
    public Float area() {
        float s = this.perimeter()/2;
        return (float)(Math.sqrt((s-this.sideOne))*(s-this.sideTwo)*(s-this.sideThree)*s);
    }
    
}
