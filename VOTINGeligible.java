import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
     boolean india;
    int ag,yr;
    
    System.out.println("ELIGIBLITY FOR VOTING IN INDIA");
    System.out.println("ARE YOU BORN IN INDIA");
    
    System.out.println("ENTER TRUE OR FALSE");
    india=sc.nextBoolean();
    
    if(india)
    {
      System.out.println(" ENTER YOUR AGE");
      ag=sc.nextInt();
       if(ag>=18)
       {
         System.out.println("YOU ARE ELIGIBLE FOR VOTING IN INDIA");
       }
       else
        System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING");
    }
    
    else 
    {
     System.out.println("HOW MANY YEARS YOU LIVE IN INDIA");
     yr=sc.nextInt();
     if(yr>=5)
     {
       System.out.println(" ENTER YOUR AGE");
       ag=sc.nextInt();
       if(ag>=18)
       {
        System.out.println("YOU ARE ELIGIBLE FOR VOTING IN INDIA");
       }
     }
     else
       System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING");
    }

  }
}
