import java.util.Scanner;
//Imports the java scanner function

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.err.println("           AAA           BBBBBBBBBBBBBB         ");
    System.err.println("          AAAAA          BBB      BBBBBB        ");
    System.err.println("         AAA AAA         BBB       BBBBBB       ");
    System.err.println("        AAA   AAA        BBB      BBBBBB        ");
    System.err.println("       AAA     AAA       BBBBBBBBBBBBBB         ");
    System.err.println("      AAAAAAAAAAAAA      BBB        BBBBB       ");
    System.err.println("     AAA         AAA     BBB         BBBBB      ");
    System.err.println("    AAA           AAA    BBB        BBBBBB      ");
    System.err.println("   AAA             AAA   BBBBBBBBBBBBBBBB       ");

    Scanner scan = new Scanner(System.in);
    //Initializes scanner for user input

    String fiveLetterString = "";
    String threeLetterString = "";
    String reverseString = "";
    //Initializes variables as blank strings

    System.err.println();
    System.err.println();
    System.err.println("Enter a 5 letter string: ");
    
    fiveLetterString = scan.nextLine(); 
    //Sets the variable fiveLetterString to the next string that the user inputs in console
    
    threeLetterString = fiveLetterString.substring(1, (fiveLetterString.length() - 1)); 
    //Removes the first and last character of the fiveLetterString varible

    for (int i = 0; i < threeLetterString.length(); i++) {
      reverseString = threeLetterString.charAt(i) + reverseString;
      //Appends the character at index(i) of threeLetterString to the front of reverseString, with i increasing by 1 for each loop
    }
    System.err.println(reverseString);
    
    scan.close();

  }
}