import java.util.Scanner;

public class coinCounter {
    public static void main(String[] args) {
        System.out.println("**************Welcome to the Year Up change counter**************");
        System.out.println("This program will take your change and credit your account.");
        Scanner myObj = new Scanner(System.in);
        System.out.println("How many pennies are you depositing: ");
        Double pennies = myObj.nextDouble();
        System.out.println("How many nickels are you depositing: ");
        Double nickels = myObj.nextDouble();
        System.out.println("How many dimes are you depositing: ");
        Double dimes = myObj.nextDouble();
        System.out.println("How many quarters are you depositing: ");
        Double quarters = myObj.nextDouble();

        Double total = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);

        Double cents = total % 100;

        Double dollars = (total - cents) / 100;
        myObj.close();
        System.out.println("**************Thank you!**************");

        System.out.println("We will now credit your account with " + dollars + " dollars and " + cents + " cents.");
    }
}
