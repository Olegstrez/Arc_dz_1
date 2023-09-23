import java.util.ArrayList;
import java.util.List;

public class store {

    private List<Order> orders= new ArrayList<>();


    public boolean addOrder(Order order){
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id){
        orders.remove(id);
        return true;
    }

    public boolean paymentOrder(int id){

        return true;
    }
}
