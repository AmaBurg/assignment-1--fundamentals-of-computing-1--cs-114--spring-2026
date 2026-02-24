import java.util.Scanner;
import java.util.Random;
//Imports the java scanner & random function

public class Assignment1Program1 {
  public static void main(String[] args) {
    String fiveLetterString = "";
    String threeLetterString = "";
    String reverseString = "";

    Scanner input = new Scanner(System.in);

    double fahrenheit;
    double celsius;
    double conversionFactor = 5.0/9.0;

    Random generator = new Random();
    int randNum = generator.nextInt(32, 16384);

    System.out.println("           AAA           BBBBBBBBBBBBBB         ");
    System.out.println("          AAAAA          BBB       BBBBB        ");
    System.out.println("         AAA AAA         BBB        BBBBB       ");
    System.out.println("        AAA   AAA        BBB       BBBBB        ");
    System.out.println("       AAA     AAA       BBBBBBBBBBBBBB         ");
    System.out.println("      AAAAAAAAAAAAA      BBB         BBBB       ");
    System.out.println("     AAA         AAA     BBB          BBBB      ");
    System.out.println("    AAA           AAA    BBB         BBBBB      ");
    System.out.println("   AAA             AAA   BBBBBBBBBBBBBBBB       ");
    System.out.println();
    System.out.println();
    System.out.println("Enter a 5 letter string: ");

    fiveLetterString = input.nextLine();

    threeLetterString = fiveLetterString.substring(1, (fiveLetterString.length() - 1));
    for (int i = 0; i < threeLetterString.length(); i++) {
      reverseString = threeLetterString.charAt(i) + reverseString;
    }

    System.out.println("Enter a number in Fahrenheit: ");
    fahrenheit = input.nextDouble();
    celsius = (fahrenheit - 32) * conversionFactor;
    input.close();

    System.out.println("Generating random number...");
    System.out.println("Your new string is: " + celsius + reverseString + randNum);
  }
}
