/**
 * Implement grading system.
 */
public class GPA {
    public void addGrade(int credit, float grade) {
        sum=credit*grade;
        gpa=gpa+sum;
        count=count+credit;
    }

    public float get() {
        if(sum==0){
            gpa=0;
        }
        else{
            gpa=gpa/count;
        }
        return gpa;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %f\n", gpa.get());
    }
    private
        float gpa=0;
        float sum=0;
        float count=0;
}
