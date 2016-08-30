/**
 * Implement grading system.
 */
public class GPA {
    private float sum=0;
    private  float total=0;
    private  float  alltotal=0;
    public void addGrade(int credit, float grade) {
        sum += credit*grade;
        total += credit;
        alltotal = sum/total;
    }


    public float get() {
        if (sum == 0) {
            return 0;
        } else{
            return alltotal;
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
