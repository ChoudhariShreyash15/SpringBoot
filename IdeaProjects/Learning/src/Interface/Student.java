package Interface;

public interface Student {
    abstract String a();
    abstract String b();
    default String c(){return "run";}
    static String d(){return "sir";}
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

class Main {
    public static void main(String[] args) {
        AB ab = new AB();
        System.out.println(ab.c());
        System.out.println(Student.d());
        Student s = new AB();
    }
    static class z {
    }
}