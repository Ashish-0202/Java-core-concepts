**Abstraction**

* A class that is declared with "abstract" keyword will be an abstract class.
* An abstract class contains abstract methods(methods without body) and also it can have non-abstract methods(methods with body) as well.
* An abstract class cannot be instantiated, which means that we cannot create object for abstract class.
* If we extend the abstract class, we need to implement the abstract methods as well and need to give the body for the methods.
* If there is any abstract method in a class then that class must be declared abstract.

Can you have constructor in abstract class?

yes we can have a constructor inside abstract class.
We use constructors to initialize the data members of the class and abstract class can have data members.

When you extend an abstract class it will become a parent class, and when you have a default constructor in child class that is a non-abstract class

Then here the first line of child class constructor will call the super class constructor and this time you abstract class constructor will be invoked.
