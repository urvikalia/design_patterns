package org.practice.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Command {

    public static void main(String[] args) {
        Document document = new Document("");

        List<DocumentCommand> commands = new ArrayList<DocumentCommand>();
        commands.add(new AddCharDocumentCommand(document, 'H'));
        commands.add(new AddCharDocumentCommand(document, 'i'));

        for (DocumentCommand command : commands ) {
            command.executeCommand();
        }
        String content = document.getContent();
        System.out.println("Hello to command pattern... ");
        System.out.println(content);


    }
}
