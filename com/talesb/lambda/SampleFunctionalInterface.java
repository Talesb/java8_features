package com.talesb.lambda;


// Only one abstract method is allowed in a functional interface
@FunctionalInterface
public interface SampleFunctionalInterface {
    void method();
}


// A lambda expression is just a block of code that helps in making your code more concise.
// Lambda expression only works with functional interface.
// A  lambda expression is an instance e of a class that implements the functional interface.
// Lambdas look a lot like methods and in some quartes are calles "anonymous methods".However, it is an instace with everything but the method stripped away.
// A lot can be infered (by the compiler) from the interface definition (wich remember, has only one abstract method).The lambda expression is just a shorthand way of creating an instance of a class that implements the interface.