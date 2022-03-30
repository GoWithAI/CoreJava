package data.ecom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderDataBase {

	
	public static List<Order> getAllOrders() {

		OrderItem i= new OrderItem(10);
		OrderItem i2= new OrderItem(15);
		List<OrderItem> list = new ArrayList<OrderItem>();
		list.add(i);
		list.add(i2);
		
		Order order1 = new Order(1, list, 0);
		
		OrderItem i3= new OrderItem(10);
		OrderItem i4= new OrderItem(3);
		List<OrderItem> list2 = new ArrayList<OrderItem>();
		list2.add(i3);
		list2.add(i4);
		
		Order order2 = new Order(1, list2, 0);

	
		
		List<Order> orderList = Arrays.asList(order1,order2);
		return orderList;
	}
}