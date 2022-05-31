# Lambda Expression

## What is Lambda Expression ?

1. The expression through which we can represent an Anonymous function
2. Anonymous : Nameless / Unknown
   1. Anonymous function: A method who don't have any name or modifier
   
      Syntax: Parameter Expression Body
      ()-> System.our.println("Lambda Syntax")

```java
// Anonymous Function Example
public class AnonymousFunEx {
    public void m1(){
       System.out.println("Normal Method / Function");
    }
    
    () {
      System.out.println("Anonymous Method / Function");
   }

   public static void main(String[] args) {
      new AnonymousFunEx().m1();
   }
}
```

## Functional Interface

The interface who contains only one abstract method but can have multiple default and statuc
method is called functional interface.

Ex:

Runnable: run()
Callable: call()
Comparable: compareTo()
Comparator: compare()




