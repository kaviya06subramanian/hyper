import java.util.Scanner;

class Armstrong {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);

   int n,i,tem;
   int r,s=0;
   System.out.println("enter the range");
   n=sc.nextInt();

   System.out.println("the armstrong numbers are");

   for(i=1;i<=n;i++)
   { 
      tem=i;
      while(tem>0)
      {
        r=tem%10;
        s=s+(r*r*r);
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

