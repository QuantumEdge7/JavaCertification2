package chapter3.genericdemo;


//3.Generic Interface
//Generics can also be applied to interfaces
public interface Repository<T> {

	void save(T item);

	T findById(int id);
}
