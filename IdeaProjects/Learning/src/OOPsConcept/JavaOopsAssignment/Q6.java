package OOPsConcept.JavaOopsAssignment;

public class Q6 {
    static int instanceCount = 0;  // Static variable to track instances
    int id;
    String name;

    // Constructor
    Q6(int id, String name) {
        this.id = id;
        this.name = name;
        instanceCount++;  // Increment count when new instance is created
    }

    Q6() {
        instanceCount++;  // Increment count when new instance is created
    }

    // Method to display instance details
    void display() {
        System.out.println("Instance Id: " + id + ", Name: " + name);
    }

    // Static method to get total instances
    static int getInstanceCount() {
        return instanceCount;
    }

    // Static method to display total instances
    static void displayInstanceCount() {
        System.out.println("Total instances created: " + instanceCount);
    }
}

class Q6Test {
    public static void main(String[] args) {
        System.out.println("=== Instance Counter Program ===\n");

        // Create first instance
        Q6 obj1 = new Q6(1, "Object 1");
        obj1.display();
        Q6.displayInstanceCount();
        System.out.println();

        // Create second instance
        Q6 obj2 = new Q6(2, "Object 2");
        obj2.display();
        Q6.displayInstanceCount();
        System.out.println();

        // Create third instance
        Q6 obj3 = new Q6(3, "Object 3");
        obj3.display();
        Q6.displayInstanceCount();
        System.out.println();

        // Create fourth instance
        Q6 obj4 = new Q6(4, "Object 4");
        obj4.display();
        Q6.displayInstanceCount();
        System.out.println();

        Q6 obj5 = new Q6();
        obj5.display();
        Q6.displayInstanceCount();
        System.out.println();

        // Display using getter method
        System.out.println("Total instances using getter: " + Q6.getInstanceCount());
    }
}