# Functional Interfaces
  ## Different Types
  
  * Predicate <br/>
    A Predicate is a test that returns true or false
    
    ```
    
    public interface Predicate <T> {boolean test (T t) }
    
    Map<String, Integer> iqMap = new ConcurrentHashMap<String, Integer>() {
        {
            put ("Larry", 100); put ("Curly", 90); put ("Moe", 110);
        }
    };
    
    System.out.println(iqMap);
    
    iqMpa.enrtySet().removeIf(entry -> enttry.getValue() <= 100);
    System.out.println(iqMap)
    
    ```
    
  * Function<br/>
  
  ```
    public interface Function<T, R> { R apply (T,t)}
    
    Map<Integer, Integer> primeCache = new ConcurrentHashMap<>();
    
    Long smallestFactor = primeCache.computeIfAbsent (primeCandidate, (key) -> primeChecker(key));
    
    Integer primeChecker (Integer primeCandidate) {
        ../ Returns 0 if the number is prime or the smallest factor if number isn`t
        }
   ``` 
  
  * Consumer <br/>
  
    Accepts parameters but returns no results
  
  
  
  ````
  List<Thread> threads = 
                        Arrays.asList(new Thread("Larry"),
                        Arrays.asList(new Thread("Curly"),
                        Arrays.asList(new Thread("Moe"));
   threads.forEach(System.out::println)
   threads.sort(Compartor.comparing(Thread.getName));
   
  ````
  
  
  
  * Supplier <br/>
    Returns a value takes no input
    
 ```$xslt
public interfaces Supplier<T> {
    T get();
    }
```
  
  
  * BiFunction <br/>
  
    Takes two inputs and returns output of type R
  
  ```
  public interface BiFunction <T, U, R> {
    R apply (T t , U u)
  {
  
  Map<String, Integer> iqMap = new ConcurrentHashMap<String, Integer>() {
      {
          put ("Larry", 100); put ("Curly", 90); put ("Moe", 110);
      }
  };
  
  for (Map.Entry<String, Integer> entry: iqMap.entrySet())
    entry.setValue(entry.getValue() - 50)
    
   
   iqMap.replaceAll((k,v) -> v - 50);
   //replaceAll thread safe
   
   ````
   ## Summary
   __Different types of Methods__
   * Default Methods
   * Static Methods
   * Instance Methods
   * Abstract Methods _[If they override java.lang.Object]_
