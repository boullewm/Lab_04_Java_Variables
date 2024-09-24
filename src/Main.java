import java.sql.SQLOutput;

public class Main {
    public static void main(String [] args) {


        int intOperandA = 5;
        int intOperandB = 10;
        int intSum = 15;
        int intProduct = 50;
        int intDifference = 6;
        int intQuotient = 25;
        int intModulo = 20;
        double doubleOperandA = 3.50;
        double doubleOperandB = 2.50;
        double doubleSum = 1.50;
        double doubleProduct = 4.50;
        double doubleDifference = 5.50;
        double doubleQuotient = 6.50;
        int numberOfKidsInFamily = 3;
        boolean isRaining = false;
        double priceOfGallonOfGas = 3.59;
        int favoriteNumber = 9;
        double shoeSize = 10.5;
        String birthMonth = "September";
        String fullName = "William Boulle";
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);
        intQuotient = intOperandB / intOperandA;
        System.out.println("The quotient of using ints of " + intOperandB + " and " + intOperandA + " is " + intQuotient);
        intModulo = intOperandA % intOperandB;
        System.out.println("The remainder of using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);
    }
}
