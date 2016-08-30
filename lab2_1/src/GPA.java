/**
 * Implement grading system.
 */
import java.util.Scanner;

public class GPA {
    float sumgrade=0, sumcredit=0; //declare sumgrade and sumcredit to collect grade and credit
    public void addGrade(int credit, float grade) {
        sumgrade = sumgrade+(grade*credit); //grade equal grade times credit then contain in sumgrade
        sumcredit = sumcredit+credit; //contain sum of credit in sumcredit
    }


    public float get() {
        float gpa;
        if(sumcredit==0) { //if credit or divider is 0 return 0
            return 0;
        }
        else {
            gpa = sumgrade / sumcredit; //gpa = sum of grades divided by sum of credits
            return gpa;
        }
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}
