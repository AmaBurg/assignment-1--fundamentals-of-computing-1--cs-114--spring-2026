import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {
    int newBase;
    double baseMax;
    int baseTen;
    String conversion = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Base Number Converter: ");
    System.out.println("Please enter a base number from 2-9: ");

    newBase = input.nextInt();
    baseMax = Math.pow(newBase, 4) - 1;
    // Formula for max of a base = b^n - 1; b-base, n-# of digits

    System.out.println("The maximum, 4-digit, base 10 number in base " + newBase + " is: " + baseMax);
    System.out.println("Enter a base 10 number in the range of 0 to " + baseMax + " to convert to base " + newBase +": ");

    baseTen = input.nextInt();
    input.close();

    for (int i = baseTen; i > 0;) {
      conversion = (i%newBase) + conversion;
      i = i/newBase;
    }

    while (conversion.length() < 4) {
      conversion = "0" + conversion;
    }

    System.out.println(baseTen + " (base 10) = " + conversion + " (base " + newBase + ")");
  }
}
