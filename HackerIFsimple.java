 import java.util.Scanner;
 
    class Hsimple {
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE RANGE BETWEEN 0 TO 100");
        int n = sc.nextInt();
        
         if(n%2!=0)
        {
            System.out.println("ODD");
        }
        else if((n%2==0)&&((n>=2)&&(n<=5)))
        {
            System.out.println("CHILD EVEN");
        }
        else if((n%2==0)&&((n>=6)&&(n<=20)))
        {
           System.out.println("TEENAGE EVEN");  
        }
        else if ((n%2==0)&&(n>20))
        {
          System.out.println("ADULT EVEN");  
        }
    }
}
