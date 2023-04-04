package util;

import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Enter a string.");
        return this.scanner.nextLine();
    }
    boolean yesNo() {
        String userInput=this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    int getInt(){
        return this.scanner.nextInt();
    }
    int getInt(int min, int max){
        int userInt;
        do {
        System.out.printf("Please enter a whole number between %d and %d: %n", min, max);
        userInt = this.scanner.nextInt();
        } while(userInt > max || userInt < min);
        return userInt;
    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }
   double getDouble(double min, double max){
        Double userDouble;
        do {
            System.out.printf("Please enter a decimal number between %f: %n", min, max);
            userDouble = this.scanner.nextDouble();
        } while (userDouble> max || userDouble < min);
        return userDouble;
    }

}
