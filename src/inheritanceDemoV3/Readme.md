This package includes no-arg constructor in Animal class. 
Your task is remove all super() calls from the constructors of the subclasses. 
Then, run the main method in the Main class and observe.

Then, figure out what is the benefits including the no-arg(default constructor) 
in the superclass and what is the downside of it: 

The benefits of including the no-arg constructor in the superclass is that it allows the subclasses to 
inherit the superclasses no-arg constructor. /That way, when the methods from those are used in the Main class,
 they take the varibles and arguments from the superclass and use them. Instead of having to input all the 
 specific arguments in the main class, you can just type Reptile reptile = new Reptile(); and end it there./

The downside of including the no-arg constructor in the superclass is that it can be called by the subclasses, 
which can lead to unexpected behavior./In addition, in order to input new values for the objects, you would 
have to use the set() methods in the Main class in order to change the values, and you would have to set each
one individually instead of making the object with arguments all in one line./

The benefits of removing the super() calls from the constructors of the subclasses is that it prevents 
the superclasses no-arg constructor from being called by the subclasses, 
which can prevent unexpected behavior.

