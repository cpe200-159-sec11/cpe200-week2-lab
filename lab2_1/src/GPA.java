/**
 * Implement grading system.
 */
public class GPA {

    public int credit_data[]=new int[100];
    public float grade_data[]=new float[100];
    public int size=0;

    public void addGrade(int credit, float grade) {
            credit_data[size] = credit;
            grade_data[size] = grade;
            size++;
    }


    public float get() {
        float result1=0,result2=0,result=0;
        for(int i=0;i<size;i++){
            result1=result1+(credit_data[i]*grade_data[i]);
            result2=result2+credit_data[i];
        }
        if(result1==0 && result2==0){
            return 0;
        }
        else{
            result=result1/result2;
            return result;
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
