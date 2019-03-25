package arrays;

/*
  Algorithm: 2 pointer technique

 1. Read pointer to track 0's. Write pointer to track non-zero elements.
 2. Find 0 with pointer i, place j = i +1 (next to i)
 3. Swap the elements
 4. Keep incrementing j until arr.length.

 */
public class MoveZerosToEnd {

    static int[] moveZerosToEnd(int[] arr) {
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length) {

            //Find 0
            while (arr[i] != 0 && i < arr.length - 1) {
                i++;
            }
            j = i + 1; //Place j next to i

            //Keep incrementing j until j -> non-zero element
            while (j < arr.length - 1 && arr[j] == 0) {
                j++;
            }

            if (j == arr.length) {
                return arr;
            }

            swap(arr, i, j);
            i++;
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 0, 2, 8, 3, 0, 0, 6, 4, 0, 5, 7, 0};
        moveZerosToEnd(arr);
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i++] + ", ");
        }
    }
}

/**
 * Output:
 * [1, 10, 2, 8, 3, 6, 4, 5, 7, 0, 0, 0, 0, 0]
 Solution #2:
 
         int i=0,j=0;
         while(j<arr.length){
            if(arr[j]==0) j++;
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
                j++;
              }
            }
        return arr;
        
 */
