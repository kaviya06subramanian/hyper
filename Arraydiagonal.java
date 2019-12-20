import java.util.Scanner;
import java.util.*;

class Arraydiagonal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int n,m;
System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS");
n=sc.nextInt();
m=sc.nextInt();

int[][] a=new int[n][m];
int i,j;
int d1=0,d2=0;

System.out.println("ENTER THE VALUES FOR"+n+"*"+m+"MATRIX");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("THE VALUES ARE");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
if(i==j)
d1=d1+a[i][j];

if(i==(n-j-1))
d2=d2+a[i][j];
}
}

System.out.println("THE SUM OF DIAGONAL d1 IS "+d1);
System.out.println("THE SUM OF DIAGONAL d2 IS "+d2);
System.out.println("THE DIFFERENCE OF THE DIAGONALS d1-d2 IS "+d1-d2);
}
}


