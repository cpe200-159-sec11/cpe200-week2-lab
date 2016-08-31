/**
 * Implement grading system.
 */
public class GPA {
    private float grades;
    private float totalcredits;
    public void addGrade(int credit, float grade){
        this.grades += grade*credit;
        this.totalcredits += credit;
    }


    public float get() {
       if(grades==0 && totalcredits==0){
           return 0;
       }
       else
        return grades/totalcredits;
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
