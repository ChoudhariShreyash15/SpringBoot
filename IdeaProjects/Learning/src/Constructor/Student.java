package Constructor;

class Student{
    // rollNum, studName, mark1, mark2, mark3, totalMarks
    int rollNum;
    String studName;
    int mark1, mark2, mark3;
    int totalMarks;

    Student(int rollNum, String studName, int mark1, int mark2, int mark3){
        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateTotal(){
        this.totalMarks = mark1 + mark2 + mark3;
    }

    void displayStudDetails(){
        System.out.println("rollNum  studName  totalMarks");
        System.out.println(rollNum + studName + totalMarks);
    }
}
class StudentsDemo{
    public static void main(String[] args){
        Student s = new Student(1, "Shreyash", 90, 90, 90);
        s.calculateTotal();
        s.displayStudDetails();
    }
}