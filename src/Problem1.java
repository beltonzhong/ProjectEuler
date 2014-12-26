import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numInputs = input.nextInt();
    for(int i = 0; i < numInputs; i++)
      System.out.println(multiplesThreeFive(input.nextInt()));
  }

  private static int multiplesThreeFive(int number) {
    int sumThrees = (3 + number / 3 * 3) * (number / 6);
    int sumFives = (5 + number / 5 * 5) * (number / 5);
    int sumFifteen = (15 + number / 15 * 15 ) * (number / 15);
    return sumThrees + sumFives - sumFifteen;
  }
}