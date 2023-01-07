package Java;
 abstract class Animals {
    public void PrintInfo(){
    System.out.println(GetSound());
    }
protected abstract String GetSound();
    }
     class dog extends Animals implements Cloneable{
        @Override
        protected String GetSound() {
            return "barks";
        }
    } 

public class AnyClass   {
    public static void main(String[] args) {
        dog d1=new dog();
        
    }
}
