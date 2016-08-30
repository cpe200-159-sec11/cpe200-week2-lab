/**
 * Implement grading system.
 */
public class GPA {
    protected int Credit = 0;
    protected float Grade = 0;
    public void addGrade(int credit, float grade) {
        Grade += grade*credit;
        Credit += credit;
    }


    public float get() {
        if(Credit == 0 && Grade ==0){ return 0;}
        Grade /= Credit;
        return Grade;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPA is %f\n", gpa.get());
    }
}
