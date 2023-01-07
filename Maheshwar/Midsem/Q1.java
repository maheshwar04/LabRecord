package Midsem;

public class Q1 {
        public static long reverseBits(long n, int i, int j) {
          // Check if the i-th and j-th bits are different
          if (((n >> i) & 1) != ((n >> j) & 1)) {
            // XOR the i-th and j-th bits with 1 to flip them
            n ^= (1L << i) | (1L << j);
          }
          return n;
        }
      
        public static void main(String[] args) {
          long n =11L; // A sample 64-bit integer
          int i = 0; // Position of the i-th bit (0-indexed)
          int j = 2; // Position of the j-th bit (0-indexed)
          System.out.println(Long.toBinaryString(n)); // Print the original number in binary
          long reversed = reverseBits(n, i, j);
          System.out.println(Long.toBinaryString(reversed)); // Print the reversed number in binary
        }
      }
      

