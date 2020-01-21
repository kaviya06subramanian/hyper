import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      String s;
      String r= "";
 
      System.out.println("ENTER THE STRING");
      s = sc.nextLine();
 
      int length = s.length();
 
      for ( int i = length - 1; i >= 0; i-- )
      {
         r = r + s.charAt(i);
      }
      if (s.equals(r))
      {
         System.out.println("IT IS A PALINDROME");
      }
      else
         System.out.println("IT IS NOT A PALINDROME");
 
   }
}
