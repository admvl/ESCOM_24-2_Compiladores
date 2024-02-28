public class Product {
  private String company;
  private double price;
  private int quantitySold;

  public Product(String company, double price) {
    this.company = company;
    this.price = price;
  }

  public void sell() {
    quantitySold++;
  }

  public void setPrice(double newPrice) {
    price = newPrice;
  }

  public String toString() {
    return "Company: " + company + " price: " +
    price + " quantity sold " + quantitySold;
  }
}
