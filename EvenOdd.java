import java.util.Scanner;

class Even
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("ENTER THE NUMBER TO CHECK");
    n=sc.nextInt();
    
    //by normal method
     if((n%2)==0)
      System.out.println("IT IS A EVEN NUMBER");
  
    else
    System.out.println("IT IS AN ODD NUMBER");

    //by binary oprration
    if((n & 1)==0)
      System.out.println("IT IS A EVEN NUMBER");
  
    else
    System.out.println("IT IS AN ODD NUMBER");
    
    //by table format
    boolean f=false;
      for(int i=1;i<=n;i++)
      {
        int c=i*2;
        if(c==n)
        {
        f=true;
        break;
        }
      }
      if(f==true)
      System.out.println("IT IS A EVEN NUMBER");
      else
      System.out.println("IT IS AN ODD NUMBER");
      
  }
}
