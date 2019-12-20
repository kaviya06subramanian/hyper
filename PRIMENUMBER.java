import java.io.*;
import java.util.*;
import java.math.*;

public class Main 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    //USING BIG INTEGER
    System.out.println("ENTER THE NUMBER");
    BigInteger n=sc.nextBigInteger();
    System.out.println(n.isProbablePrime(1)?"PRIME NUMBER":"NOT A PRIME NUMBER");

    //USING NORMAL METHOD
     System.out.println("ENTER THE NUMBER");
     int p=sc.nextInt();
     boolean a=true;

     for(int i=1;i<p;i++)
     {
       if((p%i==0)&&(i!=1))
        a=false;
        break;
     }

     if(a)
      System.out.println("PRIME NUMBER");
     else
      System.out.println("NOT A PRIME NUMBER");
    }
}
