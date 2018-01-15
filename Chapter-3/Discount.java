import java.util.Scanner;

public class Discount
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the original price: ");
    double originalPrice = in.nextDouble();

    double discountRate;
    if (originalPrice < 128)
    {
      discountRate = 0.92;
    }
    else
    {
      discountRate = 0.84;
    }

    double discountedPrice = discountRate * originalPrice;

    System.out.printf("The discounted price is: %4.2f", discountedPrice);
    System.out.println();
  }
}
