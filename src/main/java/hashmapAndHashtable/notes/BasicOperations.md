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
* Get first element in Map:
  ```java
  Map.Entry<Character,Integer> entry = map.entrySet().iterator().next();
  entry.getKey()
  entry.getValue()
  ```
  OR
  ```java
  map.get(map.keySet().toArray()[0])
  ```
* ### computeIfAbsent: 
  ```java
  map.computeIfAbsent(sortedWord, s -> new ArrayList<>()).add(list.get(i));
  ```
