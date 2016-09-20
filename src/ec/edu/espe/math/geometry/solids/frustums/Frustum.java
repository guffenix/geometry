/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.frustums;

import ec.edu.espe.math.geometry.shapes.circunferences.Ellipse;

/**
 *
 * @author Labs-DECC
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
