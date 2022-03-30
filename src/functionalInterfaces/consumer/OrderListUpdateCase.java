package functionalInterfaces.consumer;

import java.util.List;
import java.util.function.Consumer;

import data.ecom.Order;
import data.ecom.OrderDataBase;
import data.ecom.OrderItem;

public class OrderListUpdateCase {

	static Consumer<List<Order>> updateOrderTotalPriceList = (list) -> {
		list.stream().forEach(order -> getTotalOfItems(order));
	};

	static Consumer<Order> updateOrderTotalPrice = (order) -> {
		order.setTotalPriceOfOrder(getTotalOfItems(order));
	};

	public static void main(String[] args) {
		// Approach 1
		List<Order> allOrders = OrderDataBase.getAllOrders();
		allOrders.stream().forEach(updateOrderTotalPrice);

		//Approach 2
		List<Order> allOrders2 = OrderDataBase.getAllOrders();
		updateOrderTotalPriceList.accept(allOrders2);
		
	}

	private static int getTotalOfItems(Order order) {
		return order.getItems().stream().map(OrderItem::getPrice).reduce(0, (x, y) -> x + y);
	}

}
