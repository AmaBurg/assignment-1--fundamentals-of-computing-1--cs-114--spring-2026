import java.util.Scanner;

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
    String fiveLetterString;
    System.err.println("Enter a 5 letter string: ");
    fiveLetterString = scan.nextLine();
    System.err.println(fiveLetterString);
    scan.close();
  }
}