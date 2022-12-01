import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
    int year;
    boolean isLeapYear=false;
    Scanner in=new Scanner(System.in);
        System.out.print("Enter a year:");
        year=in.nextInt();
      if(year%4==0)
      {
        isLeapYear=true;
          if((year%100==0)&&(year%400!=0))
            isLeapYear=false;

      }
          if (isLeapYear)
          {
              System.out.print(year+" is a leap year.");

          }
          else
              System.out.print(year+" isn't a leap year.");
    }


}
