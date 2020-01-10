class Automobiles
{
  public static void main(String[] args)
  {
    Vehicle v=new Vehicle();
    System.out.println(v.brand);
    v.Car();
    v.sound();
    
  }
}

class Car 
{
   String model = "MUSTANG";

   void Car()
   {
     System.out.println(model); 
   }
}

//the final class cannot inherite by other class
// but it can inherite other class 

final class Vehicle extends Car
{
  protected String brand = "FORD";

  public void sound()
 {
    System.out.println("Tuut Tuut!");
  }
}



