package structural.facade;

public class MainFacade {

  public static void main(String[] args) {
    CreditInterestFacade cif = new CreditInterestFacade();
    cif.calculateMortgageInterest(1000000d);
    cif.calculateVehicleInterest(1000000d);
    cif.calculateFreeInterest(1000000d);
  }
}