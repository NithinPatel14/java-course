public class student {
    int studentId;
    String student_name;
    String student_sername;
    int Percentage;
    void getStudent(){
        System.out.println(student_name +" " +student_sername+ "\n" + studentId+ " \n" + Percentage);
    }
    public static void main(String[] args) {
        student details = new student();
        details.studentId = 2345;
        details.student_name = "Nithin";
        details.student_sername = "Dadive";
        details.Percentage = 89;
        details.getStudent();
    }
}
