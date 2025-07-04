package org.practice.design.pattern.template;

public class Tea extends Drink{
    @Override
    public void brew() {
        System.out.println("brewing Tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add lemon");
    }


}
