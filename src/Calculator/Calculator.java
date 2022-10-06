package Calculator;

import java.util.Scanner;

/**
 * to write a calculator
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.println("1.Add\n2.Subtract\n3.Multiply\n4. Divide");
        System.out.println("Choose any operation number above:");

        int operationChoice = scanner.nextInt();

        System.out.println("How many numbers to operate?");
        int totalNumbers = scanner.nextInt();

        float[] inputArray = new float[totalNumbers];

        System.out.println("Enter the numbers on after the other: ");
        for(int i = 0;i < totalNumbers; i++) {
            inputArray[i] = scanner.nextFloat();
        }
        float result = 0;
        switch(operationChoice) {
            case 1:
                Add add = new Add();
                result = add.addArray(inputArray);
                break;
            case 2:
                Substract substract = new Substract();
                result = substract.substractArray(inputArray);
                break;
            case 3:
                Multiply multiply = new Multiply();
                result = multiply.multiplyArray(inputArray);
                break;
            case 4:
                Divide divide = new Divide();
                result = divide.divideArray(inputArray);
                break;
            default:
                System.out.println("invalid operation!");

        }
        System.out.println("result: "+ result);

    }
}
