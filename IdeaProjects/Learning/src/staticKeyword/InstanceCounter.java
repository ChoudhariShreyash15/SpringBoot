package staticKeyword;

public class InstanceCounter {
    static int instanceCount = 0;  // Static variable to track instances
    int id;
    String name;

    // Constructor
    InstanceCounter(int id, String name) {
        this.id = id;
        this.name = name;
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

class InstanceCounterTest {
    public static void main(String[] args) {
        System.out.println("=== Instance Counter Program ===\n");

        // Create first instance
        InstanceCounter obj1 = new InstanceCounter(1, "Object 1");
        obj1.display();
        InstanceCounter.displayInstanceCount();
        System.out.println();

        // Create second instance
        InstanceCounter obj2 = new InstanceCounter(2, "Object 2");
        obj2.display();
        InstanceCounter.displayInstanceCount();
        System.out.println();

        // Create third instance
        InstanceCounter obj3 = new InstanceCounter(3, "Object 3");
        obj3.display();
        InstanceCounter.displayInstanceCount();
        System.out.println();

        // Create fourth instance
        InstanceCounter obj4 = new InstanceCounter(4, "Object 4");
        obj4.display();
        InstanceCounter.displayInstanceCount();
        System.out.println();

        // Display using getter method
        System.out.println("Total instances using getter: " + InstanceCounter.getInstanceCount());
    }
}