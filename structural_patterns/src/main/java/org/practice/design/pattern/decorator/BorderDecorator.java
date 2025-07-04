package org.practice.design.pattern.decorator;

public class BorderDecorator extends ShapeDecorator implements Shape{

    private String border;

    public String getBorder() {
        return border;
    }

    public BorderDecorator(Shape shape, String border) {
        super(shape);
        this.border = border;
    }


    @Override
    public String draw() {
        return getShape().draw() + " with Border " + border;

    }
}
