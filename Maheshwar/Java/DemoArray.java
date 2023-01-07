package Java;

public class DemoArray {
    static char[] copySource = { 'f', 'g', 'o', 'd', 'a', 'm', 'n' };
    static char[] copyDest = {'a','b','c','d'};
    public static void main(String args[]) {
    System.arraycopy(copyDest, 0, copySource,0,copySource.length-4);
    // Copy from first array location by reading from the second element
    // and placing in the second array from the first element, with a length
    // of three elements
    System.out.println(new String(copyDest));
    }
    }
    
