package util;

import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    String getString(){
        return scanner.nextLine();
    }
    boolean yesNo() {
        String userInput=this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }

    int getInt(){

    }
    int getInt(int min, int max){

    }

    double getDouble(double min, double max){

    }
    double getDouble(){

    }
}
