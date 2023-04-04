import java.util.Scanner;
public class MethodsExercises {
    public static int addNumbers(int num1,int num2){
        return num1+num2;
    }
    public static int subtractNumbers (int num1, int num2){
        return num1-num2;
    }
    public static int multiplyNumbers (int num1, int num2){
        return num1*num2;
    }
    public static int divideNumbers(int num1, int num2){
        return num1/num2;
    }
    public static int findModulus(int num1, int num2){
        return num1%num2;
    }

        public static int getInteger(int min, int max) {
        Scanner myScanner = new Scanner(System.in);

        System.out.printf("Enter a number between %d and %d %n", min, max);

        int userInput = myScanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("wrong number entered");
            getInteger(min, max);
        }

        return userInput;
    }

        public static void factorialPrint() {
        Scanner myScanner = new Scanner(System.in);
        String willContinue;
        do {
            int userInput = getInteger(1, 10);

            long userFactorial = 1;
            System.out.print(userInput + "! = ");
            for (int i = 1; i <= userInput; i++) {
                userFactorial *= i;
                if (i == userInput) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.println(userFactorial);
            System.out.println("Do you want to continue? (yes/no)");
            willContinue = myScanner.next();
        } while (willContinue.equalsIgnoreCase("yes"));
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int numberOfSides = sc.nextInt();
        int firstDie = (int) (Math.random() * numberOfSides) + 1;
        int secondDie = (int) (Math.random() * numberOfSides) + 1;

        System.out.printf("%d is the value of the first roll\n%d is the value of the second roll.", firstDie, secondDie);
    }

    public static void main(String[] args) {
        System.out.println("addNumbers(10, 5) = " + addNumbers(10, 5));
        System.out.println("addNumbers(22, 7) = " + addNumbers(22, 7));
        System.out.println("~~~~");
        System.out.println("subtractNumbers(50, 5) = " + subtractNumbers(50, 5));
        System.out.println("subtractNumbers(112, 3) = " + subtractNumbers(112, 3));
        System.out.println("~~~~");
        System.out.println("multiplyNumbers(10, 5) = " + multiplyNumbers(10, 5));
        System.out.println("multiplyNumbers(100, 2) = " + multiplyNumbers(100, 2));
        System.out.println("~~~~");
        System.out.println("divideNumbers(6,3) = " + divideNumbers(6, 3));
        System.out.println("divideNumbers(18, 2) = " + divideNumbers(18, 2));
        System.out.println("~~~~");
        System.out.println("findModulus(8,3) = " + findModulus(8, 3));
        System.out.println("findModulus(10,2) = " + findModulus(10, 2));
        System.out.println("~~~~");
        getInteger(2, 10);

        System.out.println("~~~~");
        factorialPrint();

    }
}
