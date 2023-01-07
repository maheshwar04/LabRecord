package Generics;
// import java.util.ArrayList;
// import java.util.List;
// public class Ex {
// public static void main(String args[]){
// List<String> mylist = new ArrayList<String>();
// mylist.add("I love Arraylist");
// String mystring = mylist.get(0);
// System.out.println(mystring);
// }
// }
public class Ex<T> {
    private T t;
    public void set(T t) {
             this.t = t;
    }
    public T get() {
            return t;
    }
    public <U extends Number> void inspect(String string){
             System.out.println("T: "+ t.getClass().getName());
             System.out.println("U: "+ string.getClass().getName());
    }
    public static void main(String[] args) {
             Ex<Integer> integerBox = new Ex<Integer>();
            integerBox.set(15);
             integerBox.inspect("some text"); // error: is presented since this would still be  returning a String 
  
    }
    }
// public class Ex<T> {
//     // where T describes the Type of the object use
//     private T t;
//     public void set(T t) { this.t = t; }
//     public T get() { return t; }
//     }