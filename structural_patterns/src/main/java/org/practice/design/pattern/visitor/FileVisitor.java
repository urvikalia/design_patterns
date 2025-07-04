package org.practice.design.pattern.visitor;

public abstract class FileVisitor {

    abstract void visit(WordFile visitor);
    abstract void visit(PictureFile visitor);

}
