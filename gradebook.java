import java.text.DecimalFormat;
import java.util.Scanner;

public class gradebook {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        System.out.println("Step 1: Square Roots");
        for (int i = 10; i > 0; i--) {
            System.out.println("The Square root of " + i + " is " + df.format(Math.sqrt(i)));
        }
        Scanner myObj = new Scanner(System.in);
        System.out.println("Step 2: Grading for Multiple Students");
       
        String yesno = "n";
        do {
             System.out.println("Would you like to input grades? Y/N");
         yesno = (myObj.nextLine()).toLowerCase();

        if (yesno.equals("y")) {
            System.out.println("Student Name:");
            String name = myObj.nextLine();
            System.out.println("Course Name:");
            String courseName = myObj.nextLine();

            Double midterm1 = -1.1;
            while ((midterm1 < 0) || (midterm1 > 100)) {
                System.out.println("Midterm Grade (needs to be between 0-100)");
                midterm1 = myObj.nextDouble();
            } 

            Double final1 = -1.1;
            do {
                System.out.println("Final Grade (needs to be between 0-100)");
                final1 = myObj.nextDouble();
            } while (final1 <= 0 || final1 >= 100);
            Double project = -1.1;
            do {
                System.out.println("Project Grade (needs to be between 0-100)");
                project = myObj.nextDouble();
            } while (final1 <= 0 || final1 >= 100);

            Double averageGrade = (midterm1 + final1 + project) / 3;
            String letterGrade = "";
            if (averageGrade < 60) {
                letterGrade = "WEE WOO WEE WOO! LOSER ALERT!!! You have received an F in this course. LOSER!!";
            } else if (averageGrade < 70) {
                letterGrade = "Haha, you have received a D in this course. Did you even try?";
            } else if (averageGrade < 80) {
                letterGrade = "Aw Shucks! You have received a C in this course. Try harder next time...";
            } else if (averageGrade < 90) {
                letterGrade = "Nice! You have received a B. Good Job!";
            } else if (averageGrade <= 100) {
                letterGrade = "Awesome! You have earned an A in this course! You are AWESOME!";
            }

            System.out.println("Grade Results:");
            System.out.println("Student Name: " + name);
            System.out.println("Course Name: " + courseName);
            System.out.println("Midterm Exam Grade: " + df.format(midterm1));
            System.out.println("Final Exam Grade: " + df.format(final1));
            System.out.println("Project Grade: " + df.format(project));
            System.out.println("Student's Average Grade: " + df.format(averageGrade));

            System.out.println("Feedback: " + letterGrade);
            System.out.println("Would you like to input more grades? (Y/N)");
            yesno = (myObj.nextLine()).toLowerCase();
            }
            else {break;}
        } while ("y".equals(yesno)); 

        myObj.close();
    }
}