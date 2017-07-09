## Basic Operations
* ### getorDefault:
  ```
  map.put(i, map.getOrDefault(i, 0) + 1);
  ```
  #### Alternative way:
  ```
  map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
  ```

* ### computeIfAbsent: 
  ```
  map.computeIfAbsent(sortedWord, s -> new ArrayList<>()).add(list.get(i));
  ```
