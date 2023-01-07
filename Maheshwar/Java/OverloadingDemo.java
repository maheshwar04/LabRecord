package Java;

class OverloadingMethod {
    void printOutput(int a) {
    System.out.println("the ﬁrst number is: " + a);
    }
    void printOutput(int a, int b) {
    System.out.println("The two integers are: " + a + " and " + b);
    }
    double printOutput(double a) {
    System.out.println("The double number is: " + a);
    return a * a;
    }
    }
    public class OverloadingDemo {
    public static void main(String args[]) {
    double results;
    OverloadingMethod omObj = new OverloadingMethod();
    omObj.printOutput(20);
    omObj.printOutput(20, 30);
    results = omObj.printOutput(2.5);
    System.out.println("The multiplication results is: " + results);
    }
    }