/**
 * Implement grading system.
 */
public class GPA {
    private float sum_credit = 0;
    private  float sum_grade = 0;
    private  float gpa = 0;
    public void addGrade(int credit, float grade) {
       sum_grade = sum_grade+(grade*credit);
        sum_credit = sum_credit+credit;
    }
    public float get() {
        if (sum_grade > 0){
        gpa = sum_grade/sum_credit;
            return gpa;
        }
        else
            return  0;

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
