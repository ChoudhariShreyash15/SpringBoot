package Packages;

public class CalculatorTest {

    public static void main(String[] args) {
        PackageCalculator calc = new PackageCalculator();
        System.out.println("Sum = "+calc.add(10,20));
        System.out.println("Product = "+calc.multiply(10,20));
    }

}
