package org.practice.design.pattern.composite;

public class CompositePattern {

    public void CreateCompositePattern()
    {
        Menu file =new Menu("File");
        file.addMenuComponent(new MenuItem("New File"));
        file.addMenuComponent( new MenuItem("Open File"));
        file.addMenuComponent( new MenuItem("Save File"));
        Menu recentFiles = new Menu("Recent Files");
        recentFiles.addMenuComponent( new MenuItem("file 1"));
        recentFiles.addMenuComponent( new MenuItem("file 2"));
        recentFiles.addMenuComponent( new MenuItem("file 3"));
        file.addMenuComponent(recentFiles);
        file.addMenuComponent( new MenuItem("Exit"));

        file.printMenu();


    }


    /*
    So here we have three components
    menu component , Leaf element and composite
    both leaf and composite are menu component
    And composite contains a list of menuComponents which itself can be a composite or leaf item

    Its a structural design pattern
    Its about composing objects in the tree structure to represent part whole heirarchy
    Intent is to represent heirarchies
     */
    public static void main(String[] args) {
    CompositePattern compositePattern = new CompositePattern();
    compositePattern.CreateCompositePattern();


    }
}
