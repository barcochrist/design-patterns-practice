package creational.singleton;

public class Computer {

  private static Computer instance;

  private int model;

  private Computer() {
  }

  /**
   * It always returns the same instance. It's synchronized to avoid creating more than one instance
   * in different threads.
   */
  public static synchronized Computer getInstance() {
    if (instance == null) {
      instance = new Computer();
    }
    return instance;
  }

  public int getModel() {
    return model;
  }

  public void setModel(int model) {
    this.model = model;
  }
}
