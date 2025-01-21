public class Student {

    int studentId;
    String name;
    double grade;

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100)
            this.grade = grade;
    }

    public boolean isPassing() {
        if (grade >= 60) return true;
        else return  false;
    }

    @Override
    public String toString() {
        return "Student Details : " + '\n' +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", Pass=" + isPassing() + '\n' ;
    }
}
