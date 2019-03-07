package arrays;

/*
 * Pseudocode:

 [1, 2, 9] carry = 1

 def addOne(int[] arr){
     carry = 1
    for i from arr.length -1 to 0
        sum = arr[i] + carry
        if sum>9, carry = 1
        else carry = 0
        arr[i] = sum % 10
    if carry = 1
        result = new int[arr.length + 1]
        result[0] = 1
        return result
    return arr
 }

 * Track carry data point. If carry is 1 at the end then return new array else modify the existing array.

 */
public class AddOneToArray {


}
