// This program demonstrates the measurable BankAccount and Country classes

public class MeasurableDemo
{
  public static void main(String[] args)
  {
    Measurable[] accounts = new Measurable[3];
    accounts[0] = new BankAccount(0);
    accounts[1] = new BankAccount(10000);
    accounts[2] = new BankAccount(2000);

    System.out.println("Average balance: " + average(accounts));
  }

  /**
    Computes the average of the measures of the given objects
    @param objects an array of Measurable objects
    @return the average of the measures
  */

  public static double average(Measurable[] objects)
  {
    if (objects.length == 0) { return 0; }
    double sum = 0;
    for (Measurable obj : objects)
    {
      sum = sum + obj.getMeasure();
    }
    return sum / objects.length;
  }
}
