package org.practice.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    Menu(String text){
        super(text);
    }

    List<MenuComponent> menuComponents= new ArrayList<>();

    public Menu(String text, List<MenuComponent> menuComponents) {
        super(text);
        this.menuComponents = menuComponents;
    }

    public List<MenuComponent> getMenuComponents() {
        return menuComponents;
    }

    public void addMenuComponent(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }



    public void printMenu(){
        for(MenuComponent menuComponent : menuComponents){
                menuComponent.print();
                if(menuComponent instanceof Menu){
                    ((Menu) menuComponent).printMenu();
                }
        }
    }
}
