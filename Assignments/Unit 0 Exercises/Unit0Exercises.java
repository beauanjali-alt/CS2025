// Solution: Unit 0 Exercises
public class Unit0Exercises {

    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        System.out.println(obj.sleepIn(true, false));  // output: false
        System.out.println(obj.sleepIn(false, true));  // output: true

        // testing diff21() method
        System.out.println(obj.diff21(1)); // output: 2
        System.out.println(obj.diff21(10)); // output: 11
        System.out.println(obj.diff21(11)); // output: 0
        System.out.println(obj.diff21(25)); // output: 8

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5));  // output: 1250.0
        System.out.println(obj.flooringCalculator(0, 3.0));    // output: 0.0
        System.out.println(obj.flooringCalculator(100, -1.5)); // output: 0.0
    }

    // ------------------------------
    // Day 1: sleepIn
    // ------------------------------
    // We sleep in if:
    //   - It is NOT a weekday (meaning it's Saturday or Sunday), OR
    //   - We are on vacation
public boolean sleepIn(boolean weekday, boolean vacation) {
    // Case 1: It's a weekday AND we are on vacation
    if (weekday == true && vacation == true) {
        return true;
    }

    // Case 2: It's a weekday AND we are NOT on vacation
    if (weekday == true && vacation == false) {
        return false;
    }

    // Case 3: It's NOT a weekday AND we are on vacation
    if (weekday == false && vacation == true) {
        return true;
    }

    // Case 4: It's NOT a weekday AND we are NOT on vacation
    if (weekday == false && vacation == false) {
        return true;   
    } else {
    return false;
}
}


    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return 21 - n;
        }
    }

    // ------------------------------
    // Day 3: flooringCalculator
    // ------------------------------
    // Calculates cost = sqft * pricePerSqft
    // But if either number is 0 or negative, return 0.0
    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft <= 0 || pricePerSqft <= 0) {

            return 0.0;
        } else {
            
            return sqft * pricePerSqft;
        }
    }
}
