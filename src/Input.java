import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your name?");    
        String name = scanner.nextLine();

        System.out.println("How old are you?");    
        int age = scanner.nextInt();
        scanner.nextLine();  // remove the  newline character

        System.out.println("Your profession:");    
        String profession = scanner.nextLine();

        // print results captured through the console
        System.out.println("\nHello, " + name);
        System.out.println("Age: " + age);
        System.out.println("profession: " + profession+"\n");

        scanner.close(); // closing the scanner
    }
}
