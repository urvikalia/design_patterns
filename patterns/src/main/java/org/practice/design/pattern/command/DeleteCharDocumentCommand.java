package org.practice.design.pattern.command;

public class DeleteCharDocumentCommand extends DocumentCommand{

    private char c;

    public DeleteCharDocumentCommand(Document document) {
        this.document = document;
        this.c = c;
    }

    @Override
    public void executeCommand() {
        String content = this.document.getContent();
        document.setContent(content.substring(0,content.length()-1));
    }
}
