package streamInterviewQA.numeric;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import data.LineItem;
import data.Order;
import data.OrderData;

public class FlatMapExample2 {

	public static void main(String[] args) {

		List<Order> findAll = OrderData.findAll();
		// flat
		List<LineItem> collect = findAll.stream().flatMap(o -> o.getLineItems().stream()).collect(Collectors.toList());

		System.out.println(collect.size());

		BigDecimal reduce = findAll.stream().flatMap(o -> o.getLineItems().stream()).map(l -> l.getTotal())
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println("addition : " + reduce);

		System.out.println("***Average***");
		OptionalDouble average = findAll.stream().flatMap(o -> o.getLineItems().stream())
				.mapToDouble(l -> l.getTotal().doubleValue()).average();
		
		System.out.println(average.getAsDouble());

	}

	

}
