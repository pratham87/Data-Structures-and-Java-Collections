## Basic Operations
* ### getorDefault:
  ```java
  map.put(num, map.getOrDefault(num, 0) + 1);
  ```
  * map.get(num) or default is 0
  #### Alternative way:
  ```java
  map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
  ```

* ### computeIfAbsent: 
  ```java
  map.computeIfAbsent(sortedWord, s -> new ArrayList<>()).add(list.get(i));
  ```
