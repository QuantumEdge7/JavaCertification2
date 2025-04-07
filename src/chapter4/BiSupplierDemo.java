package chapter4;

@FunctionalInterface
public interface BiSupplierDemo<T, U, R> {
    R get(T t, U u);
}
