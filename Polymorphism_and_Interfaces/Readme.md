## Core Concepts

# Polymorphism

Polymorphism means “many forms”: the same reference type can point to objects of different subclasses or implementations.

In Java, this allows a superclass or interface reference (like Employee or Payable) to hold different concrete objects and still call the correct overridden method at runtime.

# Abstract Classes

An abstract class is a class that cannot be instantiated directly; it may contain abstract methods (no body) that subclasses must implement.

In this lab, classes like Employee and AbstractPoint act as blueprints that define common fields and behavior for their child classes.

# Interfaces

An interface is a pure contract: it defines method signatures and constants but no concrete implementation (before default methods).

Classes such as FullTimeEmployee and PartTimeEmployee implement interfaces like Payable, and some classes may implement multiple interfaces (e.g., Payable and Taxable) to simulate multiple inheritance.
