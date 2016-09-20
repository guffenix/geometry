package ec.edu.espe.math.geometry.triangles;

import ec.edu.espe.math.geometry.Shape;

/**
 *
 * @author Cazaesclavas
 */
public abstract class Triangle extends Shape{
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
