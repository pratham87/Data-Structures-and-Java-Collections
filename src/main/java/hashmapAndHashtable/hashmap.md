* ## Working of Hashmap
* Hashmap class:
  ```
  /* The table, resized as necessary. Length MUST Always be a power of two */
       transient Entry[] table;
  ```
	* Consists of array of Entry objects.
* HashMap has an inner class called an Entry Class which holds the key and value objects
* Below is the Entry class:

  ```
  static class Entry<K,V> implements Map.Entry<K,V> 
   {
       final K key;
       V value;
       Entry<K,V> next;
       final int hash;
       ........
   }
  ```
* K,V are objects. Thus primitives cannot be used as keys and values.  
  
 * ### put() Method:
 	* put() method is used to insert value in Hashmap using key's hashcode.

    ```
    public V put(K key, V value){
      if (key == null)
         return putForNullKey(value);
      int hash = hash(key.hashCode());
      int i = indexFor(hash, table.length);
      for (Entry<K,V> e = table[i]; e != null; e = e.next){
          Object k;
          if (e.hash == hash && ((k = e.key) == key || key.equals(k))){
               V oldValue = e.value;
               e.value = value;
               e.recordAccess(this);
               return oldValue;
            }
       }
       modCount++;
       addEntry(hash, key, value, i);
       return null;
   	}
    ```
    
    * First, it checks if the key given is null or not. If the given key is null, it will be stored in the zero position, as the hashcode of null will be zero.
    * **key .hashCode()** : Get hashcode for key
    * **hash(key.hashCode())**: Get the value within the limits of an array
    * **indexFor()**: Used to get the exact location to store the Entry object

* ### **How put() works for two different objects with same hashcode:** Using next (LinkedList concept)
	* next attribute in the Entry class points to the next object. 
	* Using this, different objects with the same hashcode will be linked to each other (like LinkedList).
	* In the case of the Collision, the HashMap checks for the value of the next attribute if it is null it inserts the Entry object in that location, if next attribute is not null then it keeps the loop running till next attribute is null then stores the Entry object there.

      | Object1 -> Object2  | Object3    | Object4   |
      | ---------           |--------    | ------    | 
      
 * ### Prevention of Duplicate Keys in HashMap:
 	* In case of duplicate keys, latest value will overwrite old value. 
 	* If key.equals(k) is true, then it will replace the value object inside the Entry class and not the key

 * ### get() Method:
  ```
  public V get(Object key) 
  {
      if (key == null)
         return getForNullKey();
       int hash = hash(key.hashCode());
       for (Entry<K,V> e = table[indexFor(hash, table.length)];e != null;e = e.next) 
       {
           Object k;
           if (e.hash == hash && ((k = e.key) == key || key.equals(k)))
               return e.value;
       }
           return null;
   }
  ```
  * Get the hashcode of key to get the location in the array (Entry[] table)

  
 * ### **How get() works for two different keys with same hashcode:**
 	* Using equals() method, compare the keys and then return the value.
 	* ``` key.equals(k)```