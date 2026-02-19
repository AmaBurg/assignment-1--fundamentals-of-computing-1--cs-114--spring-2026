import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int newBase;
    double baseMax;
    int baseTen;
    String conversion = "";
    Scanner scan = new Scanner(System.in);

    System.err.println("Base Number Converter: ");
    System.err.println("Please enter a base number from 2-9: ");
    
    newBase = scan.nextInt();
    baseMax = Math.pow(newBase, 4) - 1;
    // Formula for max of a base = b^n - 1; b-base, n-# of digits
    
    System.err.println("The maximum, 4-digit, base 10 number in base " + newBase + " is: " + baseMax);
    System.err.println("Enter a base 10 number in the range of 0 to " + baseMax + " to convert to base " + newBase +": ");
    
    baseTen = scan.nextInt();
    scan.close();
    
    for (int i = baseTen; i > 0;) {
      conversion = (i%newBase) + conversion;
      // Appends the remainder of i, or baseTen, divided by newBase to string(conversion)
      
      i = i/newBase;
    }

    while (conversion.length() < 4) {
      conversion = "0" + conversion;
    }
    // Makes string(conversion) 4 digits/characters for when the conversion of base is less than 4 digits
    
    System.err.println(baseTen + " (base 10) = " + conversion + " (base " + newBase + ")");
  }
}