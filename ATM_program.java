import java.util.Scanner;

class Main { 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    int pin=1234,p,d; 
    int a,b=25000,w,n=1;
     System.out.println("INSERT THE CARD");

 while(n!=0) 
 { 
   System.out.println("ENTER THE PIN NUMBER"); 
   p=sc.nextInt(); 

   if(pin==p){ 
     System.out.println("1.BALANCE CHECKING\n2.WIDTHDRAW\n3.PIN CHANGE\n4.AMOUNT DEPOSITION");
     a=sc.nextInt();

 switch(a) { 
   case 1:System.out.println("THE BALANCE IS "+b);
           break; 
  case 2:System.out.println ("ENTER THE AMOUNT TO WIDTHDRAW "); 
          w=sc.nextInt();
          b=b-w; 
          System.out.println("THANK YOU FOR USING ATM. THE BALANCE IS "+b); 
           break; 
  case 3:System.out.println ("ENTER THE PIN NUMBER TO CHANGE"); 
         p=sc.nextInt();
         pin=p;
         break;
  case 4:System.out.println ("ENTER THE AMOUNT TO DEPOSIT");
        d=sc.nextInt(); 
         b=b+d;
        System.out.println("THE BALANCE IS"+b);
         break; 
    } 
    }
     else {
        System.out.println("THE PIN NUMBER IS WRONG. PLEASE TRY IT AGAIN");
      } 
      System.out.println("IF YOU WANT TO CONTINUE PRESS ANY NUMBER. ELSE PRESS 0");
       n=sc.nextInt();
        }
        }
}
