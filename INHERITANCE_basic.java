class Car extends Vehicle 
{
  private String modelName = "Mustang";
     
  public static void main(String[] args) 
  {
  Car myCar = new Car();

    System.out.println("COMPANY NAME");
    System.out.println(myCar.brand);
    myCar.sound();

    System.out.println("COMPANY NAME");
    System.out.println(myCar.modelName);
    myCar.sound();
    
  }
}

class Vehicle
 {
  protected String brand = "Ford";        
  public void sound()
   {                    
    System.out.println("Tuut, tuut!");
  }
}
