package behavioral.templatemethod;

public class MainTemplateMethod {

  /**
   * We are going to execute our three payment methods. All payment methods will follow the same
   * sequence of steps.
   */
  public static void main(String[] args) {
    System.out.println("------ PAYING WITH CASH ------");
    PaymentAbstract paymentAbstract = new Cash();
    paymentAbstract.executePayment();

    System.out.println("\n------ PAYING WITH CREDIT CARD ------");
    paymentAbstract = new CreditCard();
    paymentAbstract.executePayment();

    System.out.println("\n------ PAYING WITH BITCOIN ------");
    paymentAbstract = new Bitcoin();
    paymentAbstract.executePayment();
  }
}
