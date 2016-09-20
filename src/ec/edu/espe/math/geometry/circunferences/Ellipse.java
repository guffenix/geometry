package ec.edu.espe.math.geometry.circunferences;

/**
 *
 * @author Cazaesclavas
 */
public class Ellipse extends Circunference{
    private Float radioTwo;

    @Override
    public Float perimeter() {

        return (float) (2 * Math.PI * (Math.sqrt((Math.pow(this.radio, 2) - Math.pow(this.radioTwo, 2)) / 2)));
    }

    @Override
    public Float area() {
        return (float) Math.PI * radio * radioTwo;
    }

}
