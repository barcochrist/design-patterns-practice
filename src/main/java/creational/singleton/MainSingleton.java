package creational.singleton;

public class MainSingleton {

  public static void main(String[] args) {
    Computer computer1 = Computer.getInstance();
    computer1.setModel(2000);
    System.out.println("Computer 1 model: " + computer1.getModel());

    Computer computer2 = Computer.getInstance();
    System.out.println("Computer 2 model: " + computer2.getModel());
  }
}