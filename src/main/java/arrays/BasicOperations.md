## Arrays Basic Opearations

* ### Array to List:
   * Boxing: Primitives needs to be boxed to Objects:
   	 	```java 
        int[] a ={1,2,3,4,5};
        Arrays.stream(a).boxed().collect(Collectors.toList());
        ```
   * Create a List of Integer objects: 
       ```java
       Arrays.asList(1,2,3,4,5);
       ```
