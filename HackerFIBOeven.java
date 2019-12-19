import java.io.*;
import java.util.*;

class Main {
    static long a=0,b=1,c=0,s=0, d=0;

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            long n = sc.nextLong();
            a=0;b=1;c=0;s=0;d=0;
            fact(n-1);  
           }
        }
    

public static void fact(long n)
    {
      if(d==0)
      d=n;
      if(c<d)
       {
         c=a+b;
         a=b;
         b=c;
         if((c%2==0)&&(c<d))
            s+=c;
         fact(n-1);
        }
       else
       {
        System.out.println(s);
        }
    }
}

