public class SecondChallenge {
    static void main(String[] args) {
        double firstValue = 20.00;
        double secondValue = 80.00;
        double result = (firstValue + secondValue) * 100.00;
        System.out.println("This are the result = " + result); //Output: This are the result = 10000.0

        double theRemainder = result % 40.00;
        System.out.println("This are the reminder = " + theRemainder); // Output: This are the reminder = 0.0

        boolean noRemainder = (theRemainder == 0) ? true : false;
        System.out.println("The remainder = " + noRemainder); // Output: The remainder = true
        if (!noRemainder) {
            System.out.println("Got some remainder"); // not being executed cuz the boolean value are equal to true!
        }
    }
}
