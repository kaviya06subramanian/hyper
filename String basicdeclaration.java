import java.util.Scanner;

class Strbasic
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
   //string declaration
    String s="HELLO";
    String s1=new String("EVERYONE");
    char[] c={'G','O','O','D','M','O','R','N','I','N','G'};
    String s2=new String(c);

    System.out.print(s);
    System.out.println(" "+s1);
    System.out.println(s2);
    //immutable
    s.concat("HI");//concat is used to add at the end
    System.out.println(s);
    s=s.concat(" HI");
    System.out.println(s);
  }
}
