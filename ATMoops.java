import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    
   System.out.println("WELCOME TO THE ATM");
   System.out.println("ENTER YOUR NAME AND PIN NUMBER");

   String s=sc.nextLine();
   int p=sc.nextInt();

   Atm a=new Atm(s,p);
   
   boolean z=true;
    while(z)
    {
     
   System.out.println("ENTER YOUR CHOICE");

   System.out.println("1.BALANCE CHECK\n2.WITHDRAWAL\n3.PIN NUMBER CHANGE\n4.DEPOSIT\n5.EXIT");

   int b=sc.nextInt();
   
   switch(b)
    {
      case 1: a.Balance();
              System.out.println("IF YOU WANT TO CONTINUE PRESS 1");
              int i=sc.nextInt();
              if(i==1)
              {
                z=true;
              }
              else
               {
                d=false
                }
              break;
      case 2: a.Balance();
                System.out.println("ENTER THE AMOUNT TO WITHDRAWAL");
                int w=sc.nextInt();
                a.Widthdrawal(w);
                System.out.println("IF YOU WANT TO CONTINUE PRESS 1");
                int i=sc.nextInt();
                if(i==1)
                {
                  z=true;
                }
                else
                {
                  d=false
                  }
                break;
       case 3:  System.out.println("ENTER THE PIN NUMBER TO CHANGE");
                int p1=sc.nextInt();
                a.Pin(p1);
                System.out.println("IF YOU WANT TO CONTINUE PRESS 1");
                int i=sc.nextInt();
                if(i==1)
                {
                  z=true;
                }
                else
                {
                  d=false
                  }
                break;
      case 4:  a.Balance();
               System.out.println("ENTER THE AMOUNT TO DEPOSIT");
                int d=sc.nextInt();
                a.Deposit(d);
                System.out.println("IF YOU WANT TO CONTINUE PRESS 1");
                int i=sc.nextInt();
                if(i==1)
                {
                  z=true;
                }
                else
                {
                  d=false
                  }
                break;
      case 5:  System.out.println("THANK YOU FOR USING THE ATM");
               System.exit(0);                         
     }
    }
  } 
}


class Atm
{
  private String x="Kavi";
  private  int y=2345;
  private  int b=25000;

  Atm(String s,int p)
{
  int n=0;
if((x.equals(s))&&(y==p))
{
   n=1;
}
if(n==1)
{
  System.out.println("CONTINUE");
}
else if(n==0)
{
  System.out.println("PLEASE REENTER");
  System.exit(0);
}
}

 void Balance()
  {
    System.out.println("THE BALANCE IS "+b);
  }

 void Widthdrawal(int w)
{
 if(b>=w)
 {
   b=b-w;
   System.out.println("THE BALANCE IS "+b);
 }
 else
 {
   System.out.println("THE BALANCE IS NOT SUFFICIENT");
 }
}

void Deposit(int d)
{
  b=b+d;
  System.out.println("THE BALANCE IS "+b);
}

void Pin(int p1)
{
  int r,s=0,n;
  n=p1;
  while(n!=0)
  {
    r=n%10;
    s=(s*10)+r;
    n=n/10;
  }
  if(s==p1)
  {
    System.out.println("THE NUMBER IS PALINDROME PLEASE TRY AGAIN");
  }
  else 
  {
   System.out.println("YOUR PIN NUMBER IS SUCCESSFULLY CHANGED");
   y=n;
  }

}
}


