package structural.facade;

public class MortgageCredit implements Credit {

  @Override
  public Double calculateInterest(Double amount) {
    return amount * 1.16;
  }
}
