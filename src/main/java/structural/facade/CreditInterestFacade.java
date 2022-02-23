package structural.facade;

public class CreditInterestFacade {

  private Credit mortgage;
  private Credit vehicle;
  private Credit free;

  public CreditInterestFacade() {
    mortgage = new MortgageCredit();
    vehicle = new VehicleCredit();
    free = new FreeCredit();
  }

  public void calculateMortgageInterest(Double amount) {
    System.out.println(amount + " plus mortgage interest: " + mortgage.calculateInterest(amount));
  }

  public void calculateVehicleInterest(Double amount) {
    System.out.println(amount + " plus vehicle interest: " + vehicle.calculateInterest(amount));
  }

  public void calculateFreeInterest(Double amount) {
    System.out.println(amount + " plus free interest: " + free.calculateInterest(amount));
  }
}
