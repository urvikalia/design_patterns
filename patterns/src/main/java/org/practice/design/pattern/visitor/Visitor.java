package org.practice.design.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class Visitor {

    /*
    So visitor pattern can be used , when the methods/ operations are dynamic and always keeps on adding
    rather than subclasses itself. example here the file types are restricted to word and picture
    but different functionality is being added every now and them. That time one can consider adding
    visitor pattern , so everytime a function is added a new visitor is added with number of functions equal to subtypes
    The subtype remails intact , no change to that clsss , but the visitor can be added..


    The visitor will have operation for every file type

    So for every operation you add a class, and have method for each file type

    expression problem : what is easier to use

     */
    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new WordFile());
        files.add(new PictureFile());
        FileVisitor visitor = new PrintWordVisitor();

        for(File file:files){
            file.visit(visitor);
        }
    }
}
