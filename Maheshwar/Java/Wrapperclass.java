package Java;
// import java.util.*;

//     public static void Divide(int a, int b){
        
//     }
//  public static void main(String[] args) {
// // Scanner sc=new Scanner (System.in);
// // System.out.println("Enter your number");
// // float x=sc.nextInt();
// // int a = 10;
// // long b = (int)a;
// // System.out.println(b);
//  }
// }

public class Wrapperclass {
    public static void main(String args[]){
             Animal a =new Animal();
             Dog d = new Dog();
             if(a instanceof Animal){
                 System.out.println("a is a type of Animal");
            }else{
                 System.out.println("a is NOT a type of Animal");
            }
             if(a instanceof Dog){
                 System.out.println("a is a type of Dog");
            }else{
                 System.out.println("a is NOT a type of Dog");
            }
             if(d instanceof Animal){
                 System.out.println("d is a type of Animal");
            }else{
                 System.out.println("d is NOT a type of Animal");
            }
             if(d instanceof Dog){
                 System.out.println("d is a type of Dog");
            }else{
                 System.out.println("d is NOT a type of Dog");
            }
    }
    }
