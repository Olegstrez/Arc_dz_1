import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Order {

    private  int id;
    private Buyer buyer;
    private  String address;
    private  String phone;
    private LocalDateTime orderDate;
    private static int counter=1000;

    private List<OrderItem> items = new ArrayList<>();
    {
        id =++ counter;
    }

    public Order(Buyer buyer, String address, String phone, LocalDateTime orderDate, List<OrderItem> items) {
        if (buyer == null){
            throw new RuntimeException("Покупатель должен существовать");
        }
        if (items == null||items.size()==0){
            throw new RuntimeException("Заказ должен содержать минимум одну позицию");
        }
        this.buyer = buyer;
        this.address = address;
        this.phone = phone;
        this.orderDate = orderDate;
        this.items = items;
    }
}
