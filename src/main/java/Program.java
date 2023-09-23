import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        store store = new store();

        Product product1 = new Product("AA1",123);
        Product product2 = new Product("AA2",321);


        Buyer buyer1 = new Buyer("Bayer1");
        OrderItem orderitem1 = new OrderItem(product1,2);
        OrderItem orderitem2 = new OrderItem(product1,1);
        List<OrderItem> items= new ArrayList<>();
        items.add(orderitem1);
        items.add(orderitem2);
        Order order1 = new Order(buyer1,"poltavskai","+7960777666", LocalDateTime.now(),items);
        store.addOrder(order1);

    }
}
