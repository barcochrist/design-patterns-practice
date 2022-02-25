package behavioral.templatemethod;

public class Bitcoin extends PaymentAbstract {

  @Override
  void initialize() {
    System.out.println("Initializing payment with Bitcoin");
  }

  @Override
  void startPayment() {
    System.out.println("Starting payment with Bitcoin");
  }

  @Override
  void endPayment() {
    System.out.println("Ending payment with Bitcoin");
  }
}
