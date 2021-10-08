public class Algorithms{

    // Generates the requested fibonacci numbers.
    public int[] fibonacciNumberGenerator(int numbersToGenerate){
        int[] generatedNumbers = new int[numbersToGenerate+1];
        // Default numbers.
        generatedNumbers[0] = 0;
        generatedNumbers[1] = 1;

        // Continues to cycle numbers until it has generated the requested amount.
        for (int clock = 2; clock < generatedNumbers.length; clock++){
            generatedNumbers[clock] = generatedNumbers[clock-2] + generatedNumbers[clock-1];
        }

        // Returns sequence.
        return  generatedNumbers;
    }

    // Generates the requested prime numbers.
    public int[] primeNumberGenerator(int numbersToGenerate){
        // Stores the generated number sequence.
        int[] generatedNumbers = new int[numbersToGenerate];
        // Tracks the amount of generated numbers.
        int numbersGenerated;

        // More than 3 prime numbers.
        if(generatedNumbers.length > 3){
            // Default numbers.
            generatedNumbers[0] = 2;
            generatedNumbers[1] = 3;
            generatedNumbers[2] = 5;
            generatedNumbers[3] = 7;
            numbersGenerated = 4;

            // Continues to cycle numbers until it has generated the requested amount.
            for (int clock = 8; numbersGenerated != numbersToGenerate; clock++){
                // Checks if the number is prime.
                if(clock % 2 != 0 && clock % 3 != 0 && clock % 5 != 0 && clock % 7 != 0){
                    generatedNumbers[numbersGenerated] = clock;
                    numbersGenerated++;
                }

            }

        }
        // 3 prime numbers.
        else if (generatedNumbers.length == 3){
            generatedNumbers[0] = 2;
            generatedNumbers[1] = 3;
            generatedNumbers[2] = 5;
        }
        // 2 prime numbers.
        else if(generatedNumbers.length == 2){
            generatedNumbers[0] = 2;
            generatedNumbers[1] = 3;
        }
        // 1 prime number.
        else{
            generatedNumbers[0] = 2;
        }

        // Returns sequence.
        return generatedNumbers;
    }

    // Prints the generated sequence of numbers.
    public void print(int[] numbersToPrint){
        // Prints fibonacci sequence.
        if(numbersToPrint[0] == 0){
            System.out.print(numbersToPrint[1]);
            for (int clock = 2; clock < numbersToPrint.length; clock++){
                System.out.print(", " + numbersToPrint[clock]);
            }
        }
        // Prints prime number sequence.
        else{
            System.out.print(numbersToPrint[0]);
            for (int clock = 1; clock < numbersToPrint.length; clock++){
                System.out.print(", " + numbersToPrint[clock]);
            }
        }

        System.out.println();
    }

}