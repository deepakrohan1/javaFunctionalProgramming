#Streams

_Parallelization_

__Pipiline__ of aggregrate operations (behaviour) parameter for every element <br/>

```$xslt
Stream
    .of ("test", "ha")  //Creates a stream from a source Array -> Stream
    .filter(s -> toLowerCase(s.charAt(0)) == "h")     //aggregate operations Lambdas or Method refernce
    .map(this::capitalize) //Method reference
    .sorted()
    .forEach(System.out::println) //terminal operation
```

parallel steams race conditions "processing pipelines" <br/>
* Each stream has only one terminal operations

## Aggregate operations
