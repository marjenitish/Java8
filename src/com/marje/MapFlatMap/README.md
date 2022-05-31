# Map() and flatMap()

1. Java 8 stream API provides map() and flatMap() method. Both
these methods are intermediate methods and returns another stream
as part of the output.
2. map() method used for transformation
3. flatMap() used for transformation and flattering
4. flatMap() -> map() + flattering

## map() method -> Data Transformation

1. map() takes Stream<T> as input and return Stream<R>
2. Stream<R> map(Stream<T> input){}
3. It's mapper function produces single value for each input value.
Hence, it is also called  One-To-One mapping.

## Map Vs FlatMap
| Map                                                                                       | FlatMap                                                                                     |
|-------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|
| It processes stream of values                                                             | It processes stream of stream of values.                                                    |
| It does only mapping                                                                      | It performs mapping as well as flattening.                                                  |
| It's mapper function produces single value for each input value.                          | It's mapper function produces multiple values for each input value.                         |
| It is a On-To-One mapping                                                                 | It is a One-To-Many mapping                                                                 |
| Data Transformation: From Stream to Stream                                                | Data Transformation " From Stream<Stream to Stream>                                         |
| Use this method when the mapper function is producing a single value for each input value | Use this method when the mapper function is producing multiple values for each input value. |