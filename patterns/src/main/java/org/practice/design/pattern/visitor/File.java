package org.practice.design.pattern.visitor;

public interface File {

    // Typically this can be named as accept function
    // logically makes sense the object accepts a visitor
    public void visit(FileVisitor visitor);
}
