## Basic Operations
* ### getorDefault:
  ```java
  map.put(i, map.getOrDefault(i, 0) + 1);
  ```
  #### Alternative way:
  ```java
  map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
  ```

* ### computeIfAbsent: 
  ```java
  map.computeIfAbsent(sortedWord, s -> new ArrayList<>()).add(list.get(i));
  ```
