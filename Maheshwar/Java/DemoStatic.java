package Java;
class demo{
public static void copyVal(String st1, String st2) {
    System.out.println("The First value is: "+st1);
    System.out.println("The Second value is: "+st2);
    st2=st1; //performs the copying of the first value to the second value
    System.out.println("The First value is: "+st1);
    System.out.println("The Second value is: "+st2);
    }
public class DemoStatic {
        // public static void copyVal(String st1, String st2) {
        // st2=st1; //performs the copying of the first value to the second value
        // System.out.println("The First value is: "+st1);
        // System.out.println("The Second value is: "+st2);
        // }
        public static void main(String[] args) {
                copyVal("ABC", "XYZ");
        }
        }
    }

