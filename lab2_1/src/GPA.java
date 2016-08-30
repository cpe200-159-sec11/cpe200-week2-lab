/**
 * Implement grading system.
 */
public class GPA {

    private float gpa = 0;
            float count=0;
    public void addGrade(int credit, float grade) {

        gpa = gpa + (credit*grade);
        count = count + credit;
    }


    public float get() {

        float sum;
        if(count==0) {
        sum =0;
        }
        else
        {
            sum = gpa/count;
        }

        return sum;
    }
    public static void main(String[] args) {
        GPA gpa = new GPA();
        System.out.println("Add data");
        gpa.addGrade(3, 4);     // Got A for 3 credits class
        gpa.addGrade(3, 3.5f);   // Got B+ for 3 credits class
        gpa.addGrade(2, 2);     // Got C for a 2 credits class
        System.out.printf("My GPS is %.2f\n", gpa.get());
    }
}
