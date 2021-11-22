package ir.javaCup.services;


public interface Services<T> {
    int add(T t);

    void update(int id);

    void delete(int id);

}
