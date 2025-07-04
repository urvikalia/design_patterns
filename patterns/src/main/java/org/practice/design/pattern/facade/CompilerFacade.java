package org.practice.design.pattern.facade;

public class CompilerFacade implements Compiler{

    private Lexer lexer;
    private Parser parser;
    private SemanticAnalyzer semanticAnalyzer;
    private CodeGenerator codeGenerator;

    public CompilerFacade() {
        this.lexer = new Lexer();
        this.parser = new Parser();
        this.semanticAnalyzer = new SemanticAnalyzer();
        this.codeGenerator = new CodeGenerator();
    }

    @Override
    public void compile() {
        System.out.println("Compilation: Starts.....");
        lexer.tokenize();
        parser.parse();
        semanticAnalyzer.analyze();
        codeGenerator.generateCode();
        System.out.println("Compilation: Ends.....");
    }
}
