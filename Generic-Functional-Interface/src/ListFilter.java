@FunctionalInterface
public interface ListFilter<T> { // <T> ekledik, artık Generic oldu.
    boolean satisfiesCondition(T item);
}