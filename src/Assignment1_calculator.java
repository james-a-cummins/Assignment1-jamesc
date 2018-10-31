import java.util.Scanner;



public class Assignment1_calculator {

    public static void main(String[] args) {
        int num = 0;

        int grade1 = gradePrompt(num);

        int grade2 = gradePrompt(num);

        int grade3 = gradePrompt(num);

        int grade4 = gradePrompt(num);

        int grade5 = gradePrompt(num);

        double avg = averageGrade(grade1, grade2, grade3, grade4, grade5); //The values of all 5 of the 'grade#' variables are sent to the averageGrade function, where there will be averaged.

        avg = Math.round(avg * 10.0) / 10.0;

        String letterGrade;
        if (avg >= 80 && avg <= 200) {
            letterGrade = "A";
        } else if (avg >= 70 && avg <= 79) {
            letterGrade = "B";
        } else if (avg >= 60 && avg <= 69) {
            letterGrade = "C";
        } else if (avg >= 50 && avg <= 59) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.printf("Your overall average for all your classes is %f. Your overall letter average is %s.", avg, letterGrade);
    }

    public static double averageGrade(int num1, int num2, int num3, int num4, int num5){ //This is where we give a

    return (float) (num1+num2+num3+num4+num5)/5; //This line of code will take all of the integers imputed to the method, and average them all into a single float. This is then returned to main method.
    }

    public static int gradePrompt(int grd){

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("%nPlease enter a course grade in percents: "); //Here is where the user is prompted to enter their grades. This serves the function of setting the 'grade#' variables in the main method, allowing the program to do it's intended purpose. This function also gives the letter grade of each individual class.
        grd = keyboard.nextInt();

        String letterGrade;
        if (grd>=80 && grd<=200){
            letterGrade = "A"; // grd can go up to 200 to account for bonus marks. The chances of a grade going up to 200 is near-impossible, but I want to make sure every possible grade is accounted for.
        } else if (grd>=70 && grd<= 79){
            letterGrade = "B";
        } else if (grd>=60 && grd<=69){
            letterGrade = "C";
        } else if (grd>=50 && grd<=59){
            letterGrade = "D";
        } else if (grd>=0 && grd<=49){
            letterGrade = "F";
        } else {
            throw new IllegalArgumentException("You had put in an invalid number for your grade. Only numbers between 0 and 200 are valid.");
        } //The IllegalArgumentException is put in to prevent users from imputing a grade that would be impossible to attain in real life. Such as negative marks or grades well past 100.

        System.out.printf("The mark for this course is %d. You are getting a %s in this class.%n", grd, letterGrade);

        return grd; //This returns the value of grd, setting the value of a 'grade#' variable to the number imputed into the function.
    }
}
