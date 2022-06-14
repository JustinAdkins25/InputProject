import java.util.Scanner;

public class InputProject {



    public static void main(String[] args){
         int weeks;
         int days = 7;
         int hours = 168;
         int minutes = 10080;
         int seconds = 604800;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number weeks: ");
        weeks = scan.nextInt();


       System.out.println("Days: " + (weeks) * 7 / 1);
       System.out.println("Hours: " + (weeks) * hours);
       System.out.println("Minutes: " + (weeks)* minutes);
       System.out.println("Second: " + (weeks) * seconds);






    }
}
