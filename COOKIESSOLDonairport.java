/*the number of cookies sold on a day by a shop in the airport.
  Assume that the flights which took off are filled to the capacity, flights which landed are half filled and all passengers bought 2 cookies each.*/
//infytq python program
import java.util.Scanner;

class Flights
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("THE NUMBER OF FLIGHTS TOOK OFF");
    int flightoff=sc.nextInt();
    System.out.println("THE NUMBER OF FLIGHTS LANDED");  
    int flightlan=sc.nextInt();
    System.out.println("THE NUMBER OF SEATING CAPACITY OF FLIGHTS TOOK OFF");
    int offseat=sc.nextInt();
    System.out.println("THE NUMBER OF SEATING CAPACITY OF FLIGHTS TOOK OFF");
    int lanseat=sc.nextInt();

    int off=flightoff*offseat;
    int lan=flightlan*lanseat/2;
    int t=off+lan;
    int c=t*2;
    System.out.println("THE NUMBER OF COOKIES SOLD"+c);
  }
}
