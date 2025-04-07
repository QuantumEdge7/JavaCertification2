package chapter3.genericdemo;

public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		
		Pair<String, String> p2 = new OrderedPair<>("Hello", "world");
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
	}

}
