# Consumer Functional Interface

Consumer<T> is an in-built Functional interface introduced in Java 8.
Consumer can be used in all contexts where an object needs to be consumed
i.e. taken as input, and some operation is to be performed
on the object without returning any result.

```java
/*
 * Performs this operation on the given argument.
 * @param t the input argument
 * 
 * void accept(T t);
 * */
```

# Predicate Functional Interface

This Functional interface used for conditional check
where you think, we can use these true/false returning functions
in day to day programming we should choose Predicate

```java
/*
 * Evaluates this predicate on the given argument.
 * @param t the input argument
 * 
 * boolean test(T t);
 * */
```

# Supplier Functional Interface

Supplier can be used in all contexts where there is no input but
an output is expected

```java
/*
 * Gets a result
 * @return a result
 * 
 * T get();
 * */
```

