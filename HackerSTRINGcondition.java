 import java.util.Scanner;
 
 class Str {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE\nINTEGER\nDOUBLE\nSTRING");
        
        int i = sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine();
        String s=sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
