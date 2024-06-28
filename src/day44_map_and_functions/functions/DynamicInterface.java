package day44_map_and_functions.functions;
// I want to make my Functional Interface to be able to work with all different data Types
// <E> --- >  Generic
// <> ---- > defines that it will work with any data type - any object can be used
// T ----- > T is a common name used

@FunctionalInterface
public interface DynamicInterface <T> {
    void test(T t);
}