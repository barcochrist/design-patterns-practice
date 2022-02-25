package behavioral.templatemethod;

public class CreditCard extends PaymentAbstract {

  @Override
  void initialize() {
    System.out.println("Initializing payment with Credit Card");
  }

  @Override
  void startPayment() {
    System.out.println("Starting payment with Credit Card");
  }

  @Override
  void endPayment() {
    System.out.println("Ending payment with Credit Card");
  }
}
