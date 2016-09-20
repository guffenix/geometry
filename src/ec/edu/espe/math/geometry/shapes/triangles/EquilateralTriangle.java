
package ec.edu.espe.math.geometry.shapes.triangles;

import java.util.Objects;

/**
 *
 * @author Cazaesclavas
 */
public class EquilateralTriangle extends Triangle{

    private Float sideOne;
    
    @Override
    public Float perimeter() {
        return 3 * this.sideOne;
    }

    @Override
    public Float area() {
        return (float)(Math.sqrt(3/4)*Math.pow(this.sideOne, 2));
    }

    public Float getSideOne() {
        return sideOne;
    }

    public void setSideOne(Float sideOne) {
        this.sideOne = sideOne;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.sideOne);
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
        final EquilateralTriangle other = (EquilateralTriangle) obj;
        if (!Objects.equals(this.sideOne, other.sideOne)) {
            return false;
        }
        return true;
    }
    
}
