package org.practice.design.pattern.command;

public abstract class DocumentCommand {

    protected Document document;

    public Document getDocument() {
        return document;
    }

    abstract public void executeCommand();

}
