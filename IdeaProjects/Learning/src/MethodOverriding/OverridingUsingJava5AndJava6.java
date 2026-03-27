package MethodOverriding;

interface MyInterface {
    void method1();
}

class Java5 implements MyInterface {
    @Override   // ❌ Not allowed in Java 5 for interface methods
    public void method1() {
        System.out.println("Hello");
    }
}

class Java6 implements MyInterface {
    @Override   // ✅ Allowed from Java 6 onwards
    public void method1() {
        System.out.println("Hello");
    }
}