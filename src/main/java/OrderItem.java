public class OrderItem {

  private int id;
  private Product product;
  private int quantity;
  private static int counter = 5000;

    {
        id =++counter;
    }
  public OrderItem(Product product){
      this.product = product;
      quantity =1;

  }

    public OrderItem(Product product, int quantity){
        this.product = product;
        this.quantity =quantity;
    }

}
