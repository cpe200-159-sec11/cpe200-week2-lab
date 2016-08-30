/**
 * Implement grading system.
 */
public class GPA {

    private float total;
    private float totalCredit;
    public void addGrade(int credit, float grade) {
        /* Your code here */
        total += (grade*credit);
        totalCredit += credit;
     }

    public float get() {
        /* Your code here */
        float gpa;
        if (total==0 && totalCredit==0) return 0;
        gpa = total/totalCredit;
        return gpa;
    }

    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4); // Got A for 3 credits class
        gpa.addGrade(3, 3.5f); // Got B+ for 3 credits class
        gpa.addGrade(2, 2); // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
}