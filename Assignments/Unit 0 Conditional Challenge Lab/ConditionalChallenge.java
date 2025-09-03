public class ConditionalChallenge {
    public static void main(String[] args) {
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");
        double temperature = 25.0;
        boolean isCold = true;

        if (isCold) {
            temperature = temperature - 15;
            System.out.println(
                    "Since it is cold, the adjusted temperature is: " + temperature + " deg");
        } else {
            temperature = temperature + 10;
            System.out.println(
                    "Since it is not cold, the adjusted temperature is: " + temperature + " deg");
        }

        // Part 2: Grade Calculator
        System.out.println("\n--- Part 2: Grade Calculator ---");
        int score = 92;

        if (score >= 70) {
            System.out.println("Passed with a score of " + score);
        } else {
            System.out.println("Failed with a score of " + score);
        }

        // Part 3: Season Determiner
        System.out.println("\n--- Part 3: Season Determiner ---");
        int temperature2 = 75; // change this value to test
        if (temperature2 > 80) {
            System.out.println("Temperature: " + temperature2 + " deg  Summer");
        } else if (temperature2 >= 60 && temperature2 <= 80) {
            System.out.println("Temperature: " + temperature2 + " deg means it's Spring");
        } else if (temperature2 >= 40 && temperature2 <= 59) {
            System.out.println("Temperature: " + temperature2 + " deg means it's Fall");
        } else {
            System.out.println("Temperature: " + temperature2 + " deg means it's Winter");
        }

        // Part 4: Number Classifier
        System.out.println("\n--- Part 4: Number Classifier ---");
        int number = -150; // change this value to test

        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }

        if (number > 100) {
            System.out.println(number + " is Large");
        }
        if (number < -100) {
            System.out.println(number + " is Very Negative");
        }
    }
}
