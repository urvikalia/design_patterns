package org.practice.design.pattern.composite;

public class MenuComponent{
    private String text;

    public MenuComponent(String text){
        this.text = text;
    }

    public void print(){
        System.out.println(text);
    }
}
