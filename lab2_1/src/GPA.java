/**
 * Implement grading system.
 */
public class GPA {

    private float _grade;
    private int _credit;

    public void addGrade(int credit, float grade) {
        _credit += credit;
        _grade += (grade * credit);
    }


    public float get() {

        if(_credit == 0 && _grade == 0)
        {
            return 0.0f;
        }

        return _grade / _credit;
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
