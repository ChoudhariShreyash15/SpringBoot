package OOPsConcept;

public class Student {
    String name;
    int age;
    int marks;

    public void study(){
        System.out.println(name + " is Studying");
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Shreyash";
        student.age = 23;
        student.marks = 92;

        System.out.println(student.name + " " + student.age + " " + student.marks);
        student.study();
    }
}
