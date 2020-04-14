import java.util.Scanner;

public class if_debug {
    public static void main(String[] args){
        int testscore;
        char grade;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the test score");
        testscore = input.nextInt();


        if (testscore >= 90) {
            grade = 'A';
        }
        else if (testscore >= 80) {
            grade = 'B';
        }
        else if (testscore >= 70) {
            grade = 'C';
        }
        else if (testscore >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}
