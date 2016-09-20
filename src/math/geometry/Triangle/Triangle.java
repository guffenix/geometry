/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.geometry.Triangle;

/**
 *
 * @author Labs-DECC
 */
public class Triangle extends Shape{
private Float sideOne;
private Float sideTwo;
private Float sideThree;
    @Override
    public Float perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
