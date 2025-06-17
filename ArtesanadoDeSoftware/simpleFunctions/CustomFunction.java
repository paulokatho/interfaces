package simpleFunctions;

@FunctionalInterface
public interface CustomFunction<T, R> {

    public R apply(T i);
}
