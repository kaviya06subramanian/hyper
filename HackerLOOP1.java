import java.util.Scanner;
import java.lang.Math;

class Loop
{
  public static void main(String []args)
  {
   Scanner sc= new Scanner(System.in);

   System.out.println("ENTER THE NUMBER OF TIMES THE LOOP HAS TO WORK");
   int Q=sc.nextInt();

//(a+((2^0)*b)),(a+((2^0)*b)+((2^1)*b)),....,(a+((2^0)*b)+((2^1)*b)+....+((2^n-1)*b))
   for(int i=0;i<Q;i++)
   {
   System.out.println("ENTER THE VALUES FOR A,B AND THE POWER N");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();

    int s=0;
    System.out.println("THE OUTPUT IS ");
    
    for(int j=0;j<n;j++)
    {
       double l=Math.pow(2,j);

       if(s==0)
       {
         s=(a+((int)l*b));
       }
        else 
       {
         s=(s+((int)l*b));
       }

        System.out.print(s+" ");
     }
     System.out.println();
    }
  
  }
}

