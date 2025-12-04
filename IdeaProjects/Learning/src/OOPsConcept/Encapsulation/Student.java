package OOPsConcept.Encapsulation;

public class Student {
    private String name;
    private int age;
    private int marks;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    public void study() {
        System.out.println(name + " is Studying right now!!");
    }
}

class Main{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Shreyash");
        student.setAge(23);
        student.setMarks(92);

        System.out.println(student.getName() + " " + student.getAge() + " " + student.getMarks());
        student.study();
    }
}