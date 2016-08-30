/**
 * Implement grading system.
 */
public class GPA {
    public void addGrade(int credit, float grade) {
        /* Your code here */
        sumgrade = (grade*credit)+ sumgrade;
        sumcredit = credit + sumcredit;
    }
    private float sumgrade=0;
    private int sumcredit =0;
    public float gpa=0;


    public float get() {
        /* Your code here */
        if(sumgrade > 0) {
            gpa = sumgrade / sumcredit;

            return gpa;
        }
        else return  0;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");

        System.out.printf("My GPS is %.2f\n", gpa.get());
    }
}
