
import java.util.Scanner;
public class Bob {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("You: ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Bob: Fine. Be that way!");
                } else if (input.endsWith("?")) {
                    System.out.println("Bob: Sure.");
                } else if (input.endsWith("!")) {
                    System.out.println("Bob: Whoa, chill out!");
                } else {
                    System.out.println("Bob: Whatever.");
                }
            }
    }
}
