package structural.facade;

public class FreeCredit implements Credit {

  @Override
  public Double calculateInterest(Double amount) {
    return amount * 1.80;
  }
}