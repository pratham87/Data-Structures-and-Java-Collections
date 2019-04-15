package arrays;

/*

input: 123
output: 124

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

    public static int[] addOne(int[] arr) {
        int carry = 1, i = arr.length - 1;
        while (i >= 0) {
            int sum = arr[i] + carry;
            if (sum > 9) {
                carry = 1;
                arr[i] = 0;
            } else {
                carry = 0;
                arr[i] = sum;
            }
            i--;
        }

        if (carry == 1) {
            arr = new int[arr.length + 1];
            arr[0] = 1;
        }

        return arr;
    }

    public static void main(String[] s) {
        int[] result = addOne(new int[]{9, 9, 9});
        for (int x : result) {
            System.out.print(x);
        }
    }

}
