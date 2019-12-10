import java.util.Scanner;

class Encap
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE ID USER NAME PASSWORD TO CHANGE");
    String x=sc.next();
    String y=sc.next();
    long z=sc.nextLong();
    
    Sample ob=new Sample();
    ob.setter(x,y,z);
    ob.printvalue();
  }
}


class Sample
{
private String a="anusiya";
private String b="anu";
private long c=12345;

 void setter (String x,String y,long z)
{
 a=x;
 b=y;
 c=z;
}

 void printvalue()
{
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
}
}


