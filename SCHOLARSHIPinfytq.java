//program in infytq of python assignment 13 in pseudo code
//scholarship for studentsin arts and engineering
import java.util.Scanner;

class Scholarship
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);

    System.out.println("ENTER THE DEGREE ARTS (or)ENGINEERING IN CAPS");
    String a=sc.next();

    System.out.println("ENTER THE COURSE FEE");
    int c=sc.nextInt();

    System.out.println("ENTER THE MARKS");
    int n=sc.nextInt();

    int s=1,sf=0,ff;
    String b="ARTS";
    String d="ENGINEERING";

    if(a.equals(b))
    {
      
      if(n>=90)     //if it is greater than or equal to 90
      {
       s=50;
      }
      else if((n%2)!=0)   //if it is an odd number
      {
        s=5;
      }
      
    }

    if(a.equals(d))
    {
      if(n>=85)       //if it is greater than or equal to 85
      {
        s=50;
      }
      else if((n%7)==0)   //if it is divisible by 7
      {
        s=5;
      }
      
    }
    System.out.println("THE SCHOLARSHIP IS "+s);
    sf=c*s/100;
    System.out.println("THE SCHOLARSHIP FEE IS "+sf);
    ff=c-sf;
    System.out.println("THE FINAL FEE IS "+ff);

  }
}
