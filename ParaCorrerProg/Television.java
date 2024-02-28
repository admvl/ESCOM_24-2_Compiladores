public class Television extends Product {
  private String model;
  public Television(String model, String manufacturer, double price) {
    super(manufacturer, price);
    this.model = model;
  }

  public String toString() {
    return super.toString() + " model: " + model;
  }
}

