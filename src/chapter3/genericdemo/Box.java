package chapter3.genericdemo;


//1. Generic Class
//A generic class defines a single template for
//handling multiple types.
public class Box<T> {
	
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.setItem("item1");
		System.out.println(box1.getItem());
		
		Box<Integer> box2 = new Box<>();
		box2.setItem(10);
		System.out.println(box2.getItem());
		
		Box<Double> box3 = new Box<>();
		box3.setItem(10.50);
		System.out.println(box3.getItem());
	}

}

//T => Type
//E => Element
//K => Key
//V => Value
//? => Wildcard
