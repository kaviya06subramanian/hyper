import java.util.Scanner;
import java.lang.Math;

class Main 
{
  public static void main(String[] args) 
  {
   Scanner sc=new Scanner(System.in);

   int n,i,tem,l;
   int r,s=0;
   System.out.println("ENTER THE RANGE");
   n=sc.nextInt();
   System.out.println("ENTER HOW MANY TIMES TO MULTIPLY");
   l=sc.nextInt();

   System.out.println("THE ARMSTRONG NUMBERS ARE");

   for(i=1;i<=n;i++)
   { 
      tem=i;
      while(tem>0)
      {
        r=tem%10;
        double m=Math.pow(r,l);
        s=s+(int)m;
        tem=tem/10;
      }
      if(s==i)
      {
      System.out.println(i);
      }
     s=0; 
   } 
  }
}

