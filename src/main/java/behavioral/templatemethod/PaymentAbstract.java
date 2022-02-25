package behavioral.templatemethod;

public abstract class PaymentAbstract {

  abstract void initialize();

  abstract void startPayment();

  abstract void endPayment();

  /**
   * This method is final because we don't want the subclasses to change the execution order.
   */
  final void executePayment() {
    initialize();
    startPayment();
    endPayment();
  }
}
