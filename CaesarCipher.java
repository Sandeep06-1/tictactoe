import java.util.InputMismatchException;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Caesar Cipher Generator!");

        int choice = getChoice(scanner);
        String text = getText(scanner);
        int shift = getShift(scanner);

        switch (choice) {
            case 1:
                System.out.println("Encrypted Text: " + encrypt(text, shift));
                break;
            case 2:
                System.out.println("Decrypted Text: " + decrypt(text, shift));
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }

    private static int getChoice(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Choose an option:");
                System.out.println("1. Encrypt");
                System.out.println("2. Decrypt");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (choice == 1 || choice == 2) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please choose 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    private static String getText(Scanner scanner) {
        System.out.print("Enter the text: ");
        return scanner.nextLine();
    }

    private static int getShift(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the shift value: ");
                int shift = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                return shift;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Consume invalid input
            }
        }
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - (shift % 26));
    }
}