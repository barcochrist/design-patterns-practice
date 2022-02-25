package behavioral.templatemethod;

public class Cash extends PaymentAbstract {

  @Override
  void initialize() {
    System.out.println("Initializing payment with Cash");
  }

  @Override
  void startPayment() {
    System.out.println("Starting payment with Cash");
  }

  @Override
  void endPayment() {
    System.out.println("Ending payment with Cash");
  }
}