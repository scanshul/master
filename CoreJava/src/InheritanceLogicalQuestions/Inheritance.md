Inheritance2: https://javaconceptoftheday.com/java-inheritance-practice-coding-questions/

In Java, when an object is created, the constructors of all the parent classes (from top to bottom in the inheritance hierarchy) are invoked automatically. This is also true for instance initializer blocks because they are part of the object initialization process, just like constructors.

Why does it happen?
When you create an object of class C, the constructor of C is called.
Before the constructor of C runs, Java ensures that all parent classes (A and B) are properly initialized.
As part of this process, the constructors of A and B are called, and any instance initializer blocks in those classes are executed.
The instance initializer blocks in A and B run before their respective constructors.
The same applies for C: its instance initializer block runs before its constructor.