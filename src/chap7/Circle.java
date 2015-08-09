/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

import static java.lang.Math.PI;

/**
 *
 * @author steve
 */
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius){
        super(color);
        this.setRadius(radius);
    }
    
    @Override
    public double calculateArea() {
        return PI * this.getRadius() * this.getRadius();
    }

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
