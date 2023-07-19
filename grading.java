import java.util.Scanner;
public class grading {
    public static void main(String[] args) {
        System.out.println("Step 1: Username Creation");
        System.out.println("Let's create a username for you.");
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = myObj.nextLine();

        String username = (name.substring(0, 3)).toLowerCase() + "_YearUp";

        System.out.println("Thank you. " +name+ " is now: " +username);


        System.out.println("Step 2: Odd or Even");
        System.out.println("Supply an integer between 1-100, and the program will determine if that integer is odd or even: ");
        int numba = myObj.nextInt();
        if (numba % 2 == 0) {
            System.out.println(numba + " is an even number.");
          } else {
            System.out.println(numba + " is an odd number.");
          }


          System.out.println("Step 3: Numeric Grade to Letter Grade");
          System.out.println("This program will now turn a numberical grade into a letter grade.");
          System.out.println("Input a numerical grade: ");
          double grade = myObj.nextDouble();
          if (grade < 60) {
            System.out.println(grade + " is equal to an F.");
          }
          else if (grade < 70) {
            System.out.println(grade + " is equal to a D.");
          }
          else if (grade < 80) {
            System.out.println(grade + " is equal to a C.");
          }
          else if (grade < 90) {
            System.out.println(grade + " is equal to a B.");
          }
          else if (grade <= 100) {
            System.out.println(grade + " is equal to an A.");
          }
          else {
            System.out.println(grade + " is not a valid grade!");
          }
          myObj.close();
    }

}
