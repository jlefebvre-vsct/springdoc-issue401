package demo.utils;

public interface Converter<S, T> {

	T convert(S source);

}
