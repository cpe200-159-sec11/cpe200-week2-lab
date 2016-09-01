/**
 * Implement grading system.
 */
public class GPA {
    public int[] creditarr = new int[100];
    public float[] gradearr = new float[100];
    public int size=0;

    public void addGrade(int credit, float grade) {
        creditarr[size] = credit;
        gradearr[size] = grade;
        size++;
        /* Your code here */
    }


    public float get() {
        float sumgrade =0, sumcredit = 0, Gpa=0;

        for(int i=0;i<size;i++) {
            sumcredit = sumcredit + creditarr[i];
            sumgrade = sumgrade + (gradearr[i]*creditarr[i]);
        }
        if(sumcredit==0)
        {
            Gpa =0;
        }else
        {
            Gpa = sumgrade/sumcredit;
        }

        return Gpa;



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
