package structural.facade;

public class VehicleCredit implements Credit {

  @Override
  public Double calculateInterest(Double amount) {
    return amount * 1.20;
  }
}
