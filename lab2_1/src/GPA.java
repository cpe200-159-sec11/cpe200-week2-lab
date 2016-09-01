/**
 * Implement grading system.
 */
public class GPA {
    public float[] data_Grade = new float[100];
    public int[] data_Credit = new int[100];
    public int size=0;

    public void addGrade(int credit, float grade) {
        data_Grade[size] = grade;
        data_Credit[size] = credit;
        size++;
    }


    public float get() {
        float sum = 0, totalCredit=0, sGPA=0;
        for(int i = 0; i < data_Grade.length;i++){

            sum += data_Grade[i]*data_Credit[i];
            totalCredit+=data_Credit[i];
        }
        if(!(sum != 0 && totalCredit != 0)){
            return 0;
        }
        else {
            sGPA = sum / totalCredit;
            return sGPA;
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
