public class Main {
    /*
    * Made by: Eduardo Sebastian Vela Alanis.
    * Student ID: #2918743
    * */
    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();

        // Fibonacci number generator is used.
        System.out.println("\nGenerated Fibonacci Numbers");
        algorithms.print(algorithms.fibonacciNumberGenerator(20));

        // Prime number generator is used.
        System.out.println("\nGenerated Prime Numbers");
        algorithms.print(algorithms.primeNumberGenerator(20));

    }
}
