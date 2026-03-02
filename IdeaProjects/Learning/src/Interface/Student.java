package Interface;

public interface Student {
    String a();
    String b();
    default String c(){return "run";}
    static String d(){return "sir";}
}

interface clonable extends Cloneable {
    int run();
}

class AB implements Student {

    @Override
    public String a() {
        return "";
    }

    @Override
    public String b() {
        return "";
    }

    @Override
    public String c(){
        return "test";
    }
}

class BC implements Student {

    @Override
    public String a() {
        return "";
    }

    @Override
    public String b() {
        return "";
    }
}

class CA implements Student {

    @Override
    public String a() {
        return "";
    }

    @Override
    public String b() {
        return "";
    }
}

abstract class D implements Student{
    @Override
    public String a() {
        return "";
    }
}

class Main {
    public static void main(String[] args) {
        AB ab = new AB();
        System.out.println(ab.c());
        System.out.println(Student.d());
        Student s = new AB();
//        Student s1 = new D(); //Will throw an Error to override all default methods
    }
    static class z {
    }
}