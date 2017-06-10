## HashMap vs Hashtable
* Hashtable is **synchronized**, whereas HashMap is not. 
* Thus HashMap performs better than Hashtable.
* Hashtable does not allow **null keys or values**.  HashMap allows one null key and any number of null values.
* One of HashMap's subclasses is **LinkedHashMap**, so if you want to iterate (return) in the order in which entries were inserted, you can switch from HashMap to LinkedHashMap. This wouldn't be as easy with Hashtable.
* Another HashMap's subclasses is **TreeMap**. Will return elements in a sorted order 
