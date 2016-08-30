/**
 * Implement grading system.
 */
public class GPA {
    private int sumcredit = 0;
    private float sumgrade = 0;

    public void addGrade(int credit, float grade) {
        float sum =0;
        sumgrade +=credit*grade;
        sumcredit +=credit;

    }


    public float get() {
        float ave=0;
        if(sumgrade>0){
            ave = sumgrade/sumcredit;
        }

        return ave;
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
