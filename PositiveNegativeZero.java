public class PositiveNegativeZero {

    //main method to execute the test cases (These will be converted to Junit test cases)
    public static void main(String[] args) {

        checkNumber(998); //expected result => Positive
        checkNumber(-89); //expected result => Negative
        checkNumber(700); //expected result => Positive
        checkNumber(0); //expected result => Number is Zero
        checkNumber(-2); //expected result => Negative

    }

    //Check to see what the value is and print out if it positive, negative, or equal to zero
    public static void checkNumber(int number) {
        if(number < 0) {
            System.out.println("Negative");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Number is Zero");
        }
    }

}
