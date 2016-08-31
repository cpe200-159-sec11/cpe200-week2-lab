/**
 * Implement grading system.
 */
public class GPA {
    private float SumC=0,SumG=0f;
    public void addGrade(int credit, float grade) {
        SumC += credit;
        SumG += grade*credit;
    }

    public float get() {
        float GPA;
        if(SumC==0) GPA=0f;
        else GPA = SumG/SumC;
        return GPA;
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
