package Midsem;
import java.util.*;
public class Q2 {
        public static int[] deleteDuplicates(int[] arr) {
          int n = arr.length;
          int j = 0;
          for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
              arr[j++] = arr[i];
            }
          }
          arr[j++] = arr[n - 1];
          return Arrays.copyOf(arr, j);
        }
      
        public static void main(String[] args) {
          int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9};
          System.out.println("Original array: " + Arrays.toString(arr));
          int[] noDuplicates = deleteDuplicates(arr);
          System.out.println("Array with no duplicates: " + Arrays.toString(noDuplicates));
        }
      }
      

