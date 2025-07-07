# design_patterns

Design patterns are proven solution for standard problem in software 

Design patterns are categorized into 3 categories 
1. Creational Pattern
2. Structural Pattern 
3. Behavioural Pattern

Structural Pattern: Deals which structuring of classes and Object. Basically Class and Object composition 

To name a few patterns in this category, we have:
1. Composite: Tree heirarchy : Menucomponent , MenuItem and Menu   
2. Fascade: Compiler : tokenizer, parser , semantic analyzer and Code generator
3. Decorator: when multiple decorations are to be applied to the object. Shapes and shapedecorators
4. Proxy: Client calls a proxy instead of actual object.

Behavioural pattern: Deals with how objects communicate , responsibility distribution and control flow  

1. Visitor: when subclasses are kind of fixed but the operations are added every now and them , we can have visitor pattern. file and visit, printFileVisitor 
2. Observer: typically MVC and publisher -subscriber model to be implemented Channel and Users 
3. State pattern: when state has to be extracted from invoker and implementor . Phone and ringState 
4. Strategy: the are differnt stratergies to get the work done . shoppingcart and Payment Strateries
5. Template: one needs to finalize/ templatize the algorithm (steps). prePareReceipe , Tea , Coffee
6. Command: when commands/operations on the object are to be treated as standalone objects. DocumentCommand - addChar , deleteChar , Document 


## Composite Pattern

### When to Use?

1. When you want to treat individual objects and coposition uniformly 
2. Useful in tree structure like , file system , Ors structure , menu

## Facade Pattern 

### When to Use?

1. When client shouldn't worry about the inner working 

It reduces coupling , improves usability and hides complexity 

## Decorator Pattern 

### When to Use?

1. when you want to add resposibilities without subclassing 
2. Ideal when you want to avoid deep inheritance trees 

Real life analogy: Shirt as basic object and jacket and scarf as decorators 

Remember: Decorator and object should share the same object 


## Proxy Pattern

when you need a placeholder or surrogate for another Object 
Protects , manages and optimizes access to the real object 


# Behavioural Pattern 

## Visitor pattern 

Visitor pattern lets you define new operations on the set of objects without changing their classes

Instead of adding logic to the object , you send the vistor to the object 

### When to Use?
1. USually when core objects are stable but operations keep on adding / chaning 
2. You want to avoid bloating of core classes with every new operation 
3. You want to perform multiple unrelated operations on objects without coupling them 

### Why Use?
1. Clean seperation of concern 
2. Add new behaviour without modifying the object Structure (Open / Close principles)

