package org.practice.design.pattern.visitor;

public class PrintWordVisitor extends FileVisitor {


    @Override
    void visit(WordFile file) {
        System.out.println("printing word file: Open word file and print");
    }

    @Override
    void visit(PictureFile file) {
        System.out.println("printing picture : Open viewer and print");
    }
}
