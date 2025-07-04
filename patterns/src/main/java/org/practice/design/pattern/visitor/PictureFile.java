package org.practice.design.pattern.visitor;

public class PictureFile implements File {


    @Override
    public void visit(FileVisitor visitor) {
            visitor.visit(this);
    }
}
