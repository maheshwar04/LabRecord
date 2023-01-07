package Java;

public class Dog extends AnimalProperties {
    @Override
    public void sound() {
    System.out.println("Wooof");
    }
    public static void main(String args[]) {
    AnimalProperties anmObj = new Dog();
    anmObj.sound();
    }
    }
