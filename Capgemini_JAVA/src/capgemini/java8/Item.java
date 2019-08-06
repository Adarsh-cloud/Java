package capgemini.java8;

public class Item {
	private int itemId;
	private String name;
	private float cost;
	
	public Item(){
		super();
	}
	public Item(int itemId, String name,float cost){
		super();
		setItemId(itemId);
		setName(name);
		setCost(cost);
		
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", cost=" + cost + "]";
	}
}
