package data.ecom;

import java.util.List;

public class Order {

	private Integer orderId;
	private List<OrderItem> items;
	private Integer totalPriceOfOrder;

	public Order(Integer orderId, List<OrderItem> items, Integer totalPriceOfOrder) {
		super();
		this.orderId = orderId;
		this.items = items;
		this.totalPriceOfOrder = totalPriceOfOrder;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Integer getTotalPriceOfOrder() {
		return totalPriceOfOrder;
	}

	public void setTotalPriceOfOrder(Integer totalPriceOfOrder) {
		this.totalPriceOfOrder = totalPriceOfOrder;
	}
	
	@Override
	public String toString() {
		return "total :" + totalPriceOfOrder;
	}
	
}
