package org.practice.design.pattern.command;



public class AddCharDocumentCommand extends  DocumentCommand {

    private char c;

    public AddCharDocumentCommand(Document document, char c) {
        this.document = document;
        this.c = c;
    }

    @Override
    public void executeCommand() {
        document.setContent(document.getContent() + c);
    }

    public char getC() {
        return c;
    }
}
