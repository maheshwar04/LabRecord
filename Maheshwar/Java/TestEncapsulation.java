package Java;

class DemoEncap {
    private int ssnValue;
    private int employeeAge;
    private String employeeName;
    // We will employ get and set methods to use the class objects
    public int getEmployeeSSN() {
    return ssnValue;
    }
    public String getEmployeeName() {
    return employeeName.toString();

    }
    public int getEmployeeAge() {
    return employeeAge;
    }
    public void setEmployeeAge(int newValue) {
    employeeAge = newValue;
    }
    public void setEmployeeName(String newValue) {
    employeeName = newValue;
    }
    public void setEmployeeSSN(int newValue) {
    ssnValue = newValue;
    }
    public String toString() {
        return this.employeeName + " , " + this.employeeAge ;
    }
    public boolean equals(Object other){
        if(other==this){
            return true;
        }
  if(!(other instanceof DemoEncap)){
    return false;
  }
  DemoEncap d=(DemoEncap) other;
return (ssnValue).compareto(d.ssnValue);
}
    public class TestEncapsulation {
    public static void main(String args[]) {
    DemoEncap obj1 = new DemoEncap();
    obj1.setEmployeeName("Mark");
    obj1.setEmployeeAge(30);
    obj1.setEmployeeSSN(12345);

    System.out.println("Employee Name is: " + obj1.getEmployeeName());
    System.out.println("Employee SSN Code is: " + obj1.getEmployeeSSN());
    System.out.println("Employee Age is: " + obj1.getEmployeeAge());
    System.out.println("Employee name and age  is: " + obj1.toString());
    System.out.println("Employee name and age  is: " + obj1.equals());
    }
}
