package order;

import java.util.List;

/**
 * @author Akshata
 * 
 */
public interface OrderHandler {
	
	int createOrder(String input);
	List<Order> fetchOrder(String input);
}
