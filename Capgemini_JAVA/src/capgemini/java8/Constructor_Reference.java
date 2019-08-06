package capgemini.java8;

import java.util.function.Supplier;

public class Constructor_Reference {
	public static void main(String[] args) {
		//Constructor Referencing
		
		Supplier<Item> supplierItem=Item::new;
		System.out.println(supplierItem.get());
		Item item=supplierItem.get();
		item.setItemId(101);
		item.setName("Laptop");
		item.setCost(55555.55f);
		System.out.println(item);
	}

}
