/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.circunferences;

import ec.edu.espe.math.geometry.shapes.circunferences.Circunference;
import java.util.Objects;

/**
 *
 * @author Labs-DECC
 */
public class Sphere extends Circunference implements CircunferenceSolidInterface{

    Float radio;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.radio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sphere other = (Sphere) obj;
        if (!Objects.equals(this.radio, other.radio)) {
            return false;
        }
        return true;
    }
    
}
