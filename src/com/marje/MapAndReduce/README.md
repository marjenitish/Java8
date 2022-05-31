# Map and Reduce

1. Map-Reduce is a functional programming model it serves our 
two purposes
   1. Map -> Transforming data
   2. Reduce -> Aggregating data (combine elements of a stream and
   produces a single value)
2. Ex: stream: [2,4,6,9,1,3,7] Sum of numbers present in stream?
3. Map() -> Transform Stream<Object> to Stream of int
4. Reduce() -> combine stream of int and produce the sum result

## Reduce Method
```
T reduce(T identity, BinaryOperator<T> accumulator);
```

1. identity is initial value of type T
2. accumulator is a function for combining two values

```
Integer sumResult = Stream.of(2,4,5,9,1,3,7).reduce(0, (a,b) -> a+b);
```

Identity: 0 which is nothing but initial value
Accumulator: (a,b) -> a+b function

