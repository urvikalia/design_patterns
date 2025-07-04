package org.practice.design.pattern.template;

public class Template {

    /*
    Use template pattern where there is a process to be executed
    but some of the steps can vary ... its behaviour can be overriden
    example : drink preparation : basic steps are same with some variations
    so have a method i base class which is final , and which defines the process / steps
    in derived classes can customize the required behaviour
     */
    public static void main(String[] args) {
        System.out.println("testing Template pattern");
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepareDrink();
        coffee.prepareDrink();

    }
}
