package org.practice.design.pattern.decorator;

public class Decorator {

    public static void main(String[] args) {

        /*
        Experinmenting around with decorator pattern
        So basically you want to apply multiple decorations to an entity , one can use this

        So I create a Circle , colour it red and have a thick border

         */

        Circle circle = new Circle();
        ColourDecorator redDecorator =new ColourDecorator(circle,"Red");
        System.out.println(redDecorator.draw());
        BorderDecorator thickBorder = new BorderDecorator(redDecorator, "Thick Border");
        System.out.println(thickBorder.draw());


    }
}
