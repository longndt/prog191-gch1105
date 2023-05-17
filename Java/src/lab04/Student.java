package lab04;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    private double computeGPA () {
//        double avg = 0;
//        avg = (grade1 + grade2 + grade3) / 3;
//        return avg;
        return ((grade1 + grade2 + grade3) / 3);
    }

    public void showStudyResult () {
        double gpa = computeGPA();
        System.out.println("Student Name: " + name);
        System.out.print("Student GPA: ");
        System.out.printf("%.1f",gpa);
        System.out.println();
        if (gpa >= 9.0 && gpa <= 10) {
            System.out.println("Student Ranking: Distinction");
        } else if (gpa >= 7.0 && gpa <= 8.9) {
            System.out.println("Student Ranking: Merit");
        } else if (gpa >= 5.0 && gpa <= 6.9) {
            System.out.println("Student Ranking: Pass");
        } else {
            System.out.println("Student Ranking: Refer");
        }
    }
}
