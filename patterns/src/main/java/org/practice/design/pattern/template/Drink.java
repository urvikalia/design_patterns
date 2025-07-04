package org.practice.design.pattern.template;

public abstract class Drink {

    public void boil()
    {
        System.out.println("boil water");
    }

    public void pourInCup()
    {
        System.out.println("pour in cup");
    }

    public abstract void brew();
    public abstract void addCondiments();

    public final void prepareDrink()
    {
        boil();
        brew();
        pourInCup();
        addCondiments();
    }
}
