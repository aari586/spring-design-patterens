# Spring Learning - Design Patterns

This repository contains exercises from LinkedIn learning resources on spring design patterns.

## Creation Patterns 

Example code demonstrating the creational patterns

### Factory and Abstract Factory

I am starting on one of the spring's core way that IoC leverages Factory and Abstract factory to leverage bean creation.

### Builder Pattern

Addresses how to build complex class objects with out having the noise of setting through different setters or constructor variations.

NOTE: Points to expand and observe are:
- Project Lombok

### Singleton

Addressing the singleton design pattern both the traditional way and how the spring treats every object in its context as singleton.

NOTE: Points to expand and observe are:
- Thread Safety

### Prototype

Demonstrates the spring way of creation of prototype and how through the @Scope we cab control the creation, although here the implementation is simple the prototype creation can be controlled so that 
the new creation can be provided with singleton objects to avoid cost of creation.

## Behavioural Patterens

Example code demonstrating the Behavioural patterns

### Adaptar Pattern
How we take dissimilar class with some similarities and combine the similar code path to run as one.