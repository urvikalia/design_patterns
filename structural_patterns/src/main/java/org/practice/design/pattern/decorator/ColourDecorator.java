package org.practice.design.pattern.decorator;

public class ColourDecorator extends ShapeDecorator {

    private String color;

    public String getColor() {
        return color;
    }

    public ColourDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }


    @Override
    public String draw() {
        return getColor() + getShape().draw();
    }
}
