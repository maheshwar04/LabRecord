//Write a java program to reverse the ith and jth bit of a 64-bit integer
package Midsem;

public class Q3 {
        public static boolean hasPalindrome(String sentence) {
          String[] words = sentence.split(" "); // Split the sentence into words
          for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString(); 
            if (word.equals(reverse)) { //palindrome
              return true;
            }
          }
          return false;
        }
      
        public static void main(String[] args) {
          String sentence = "Hello world madam ";
          String[] words = sentence.split(" ");
          System.out.println("Original sentence: " + sentence);
          for (String word : words) {
            String reverse = new StringBuilder(word).reverse().toString();
            System.out.println("Reverse of '" + word + "': " + reverse);
          }
          if (hasPalindrome(sentence)) {
            System.out.println("The sentence contains a palindrome.");
          } else {
            System.out.println("The sentence does not contain a palindrome.");
          }
        }
      }
      


