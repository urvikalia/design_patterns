package org.practice.design.pattern.decorator;

public abstract class ShapeDecorator implements Shape {

    private Shape shape ;

    public Shape getShape() {
        return shape;
    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }


}
