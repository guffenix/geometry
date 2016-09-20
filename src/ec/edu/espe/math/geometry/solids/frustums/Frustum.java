
package ec.edu.espe.math.geometry.solids.frustums;

import ec.edu.espe.math.geometry.shapes.circunferences.Ellipse;

/**
 *
 * @author Cazaesclavas
 */
public class Frustum extends Ellipse implements FrustumSolidInterface{

    private Float height;

    public Frustum(Float height, Float radioOne, Float radioTwo) {
        this.height = height;
        this.radio = radioOne;
        this.radioTwo = radioTwo;
    }
    
    @Override
    public Float volume() {
        return (float)((1/3)*Math.PI* this.height*(Math.pow(this.radio, 2)));
    }
    
}
