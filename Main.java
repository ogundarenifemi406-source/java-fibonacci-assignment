class Fibonacci {

    int number;

    // Constructor
    Fibonacci(int number) {
        this.number = number;
    }

    // Method to generate the Fibonacci sequence
    void generateSequence() {
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

// Main class
public class Main {

    public static void main(String[] args) {
        // Create an instance of the Fibonacci class
        Fibonacci fib = new Fibonacci(10);

        // Call the method
        fib.generateSequence();
    }
}
