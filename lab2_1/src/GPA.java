/**
 * Implement grading system.
 */
public class GPA {
    private float grade=0;
    private int credit=0;

    public void addGrade(int credit, float grade) {

        this.grade =this.grade+(grade*credit);
        this.credit=this.credit+credit;
        /* Your code here */
    }


    public float get() {
        if(this.grade==0||this.credit==0){
            return  0;
        }else {
            return (this.grade/this.credit);
        }
        /* Your code here */
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
