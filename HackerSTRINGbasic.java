
import java.util.*;

class Strbasic
{
   public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
         int l;
         l=A.length()+B.length();
         
         System.out.println(l);
         System.out.println(A.compareTo(B)>0?"Yes":"No");
         System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1)  );
        
    }
}


