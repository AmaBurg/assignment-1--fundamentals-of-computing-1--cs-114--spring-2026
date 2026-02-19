import java.util.Scanner;
import java.util.Random;
//Imports the java scanner & random function

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.err.println("           AAA           BBBBBBBBBBBBBB         ");
    System.err.println("          AAAAA          BBB       BBBBB        ");
    System.err.println("         AAA AAA         BBB        BBBBB       ");
    System.err.println("        AAA   AAA        BBB       BBBBB        ");
    System.err.println("       AAA     AAA       BBBBBBBBBBBBBB         ");
    System.err.println("      AAAAAAAAAAAAA      BBB         BBBB       ");
    System.err.println("     AAA         AAA     BBB          BBBB      ");
    System.err.println("    AAA           AAA    BBB         BBBBB      ");
    System.err.println("   AAA             AAA   BBBBBBBBBBBBBBBB       ");

    Scanner scan = new Scanner(System.in);

    String fiveLetterString = "";
    String threeLetterString = "";
    String reverseString = "";

    System.err.println();
    System.err.println();
    System.err.println("Enter a 5 letter string: ");
    
    fiveLetterString = scan.nextLine(); 
    
    threeLetterString = fiveLetterString.substring(1, (fiveLetterString.length() - 1)); 
    //Removes the first and last character of the fiveLetterString varible

    for (int i = 0; i < threeLetterString.length(); i++) {
      reverseString = threeLetterString.charAt(i) + reverseString;
      //Appends the character at index(i) of threeLetterString to the front of reverseString, with i increasing by 1 for each loop
    }
    
    Double fahrenheit;
    Double celsius;
    System.err.println("Enter a number in Fahrenheit: ");
    fahrenheit = scan.nextDouble();
    Double conversionFactor = (double)5/9;
    celsius = (fahrenheit - 32) * conversionFactor;
    scan.close();

    System.err.println("Generating random number...");
    Random generator = new Random();
    int randNum = generator.nextInt(32, 16384);

    System.err.println("Your new string is: " + celsius + reverseString + randNum);

  }
}