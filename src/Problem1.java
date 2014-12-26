import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numInputs = input.nextInt();
    for(int i = 0; i < numInputs; i++)
      System.out.println(multiplesThreeFive(input.nextInt()));
  }

  public static int multiplesThreeFive(int number) {
    number--;
    int sumThrees = (int) ((3 + number / 3 * 3) * (number / 3 / 2.0));
    int sumFives = (int) ((5 + number / 5 * 5) * (number / 5 / 2.0));
    int sumFifteen = (int) ((15 + number / 15 * 15 ) * (number / 15 / 2.0));
    return sumThrees + sumFives - sumFifteen;
  }
  //to do: test all cases 1 < n < 10^9
}