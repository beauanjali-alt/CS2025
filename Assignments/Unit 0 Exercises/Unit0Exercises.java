// Solution: Unit 0 Exercises
public class Unit0Exercises {

    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); 
        System.out.println(obj.sleepIn(true, false));  
        System.out.println(obj.sleepIn(false, true));  

        // testing diff21() method
        System.out.println(obj.diff21(1)); 
        System.out.println(obj.diff21(10)); 
        System.out.println(obj.diff21(11)); 
        System.out.println(obj.diff21(25)); 

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5));  
        System.out.println(obj.flooringCalculator(0, 3.0));   
        System.out.println(obj.flooringCalculator(100, -1.5)); 
    }

public boolean sleepIn(boolean weekday, boolean vacation) {
    if (weekday == true && vacation == true) {
        return true;
    }
    if (weekday == true && vacation == false) {
        return false;
    }
    if (weekday == false && vacation == true) {
        return true;
    }
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
    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft <= 0 || pricePerSqft <= 0) {

            return 0.0;
        } else {
            
            return sqft * pricePerSqft;
        }
    }
}
