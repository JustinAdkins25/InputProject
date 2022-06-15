import java.util.Scanner;

public class IncreaseDecrease {



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.println("Enter a number: ");
        x = scan.nextInt();
        System.out.println("Enter a second number: ");
        y = scan.nextInt();
        System.out.println("Enter a third number: ");
        z = scan.nextInt();

        if (x > y && y > z) {
            System.out.println("DECREASING");
        }
        else if ( z > y && y > x){
            System.out.println("INCREASING");
        } else{
            System.out.println("NEITHER");
        }





    }

}
