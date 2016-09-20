package ec.edu.espe.math.geometry.shapes.triangles;

import ec.edu.espe.math.geometry.shapes.ShapeInterface;

/**
 *
 * @author Cazaesclavas
 */
public abstract class Triangle implements ShapeInterface{
protected Float sideOne;
protected Float sideTwo;
protected Float sideThree;

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    public Float getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(Float sideTwo) {
        this.sideTwo = sideTwo;
    }

    public Float getSideThree() {
        return sideThree;
    }

    public void setSideThree(Float sideThree) {
        this.sideThree = sideThree;
    }
}
