import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i=5;
//        while (i<15);
//        System.out.println("i is" + i);
//        i++;

//        int i=0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <=100);
//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        int i=2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i <1000000);

//        for(int i = 5; i < 15; i += 1) {
//            System.out.println("i is "+ i);
//        }

//        for(int i=2; i<100; i+=2) {
//            System.out.println("i is " + i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        String choice;
//
//        do {
//            System.out.print("Enter an integer: ");
//            int n = scanner.nextInt();
//
//            System.out.println("Number  Square  Cube");
//            for (int i = 1; i <= n; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%-7d %-7d %-4d%n", i, square, cube);
//            }
//
//            System.out.print("Do you want to continue? (y/n): ");
//            choice = scanner.next();
//        } while (choice.equalsIgnoreCase("y"));
//
//        scanner.close();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a numerical grade from 0 to 100: ");
            int grade = input.nextInt();

            String letterGrade;
            if (grade >= 88) {
                letterGrade = "A";
            } else if (grade >= 80) {
                letterGrade = "B";
            } else if (grade >= 67) {
                letterGrade = "C";
            } else if (grade >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.printf("The corresponding letter grade is %s.%n", letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("y")) {
                break;
            }
        }

        input.close();
    }
}
