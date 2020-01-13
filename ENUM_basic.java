 class Main 
{ 
  public static void main(String[] args) 
  { 
    // enum does not need object creation
    Level myVar = Level.HIGH; 
    System.out.println("USING NORMAL METHOD");
    System.out.println(myVar);
    
    //using switch case
    System.out.println("USING SWITCH CASE");
    Switch s=new Switch();
    s.level();
    
    //using for loop
    System.out.println("USING FOR LOOP");
    for (Level my : Level.values())
     {
      System.out.println(my);
    }
  } 
}


enum Level //enumerate means constant and a "SPECIAL" class
 {
  LOW,
  MEDIUM,
  HIGH
}

 class Switch
  {
  public void level()
    {
    Level myVar = Level.MEDIUM;

    switch(myVar) {
      case LOW:   System.out.println("Low level");
                  break;
      case MEDIUM:System.out.println("Medium level");
                  break;
      case HIGH:  System.out.println("High level");
                  break;
    }
  }
}
