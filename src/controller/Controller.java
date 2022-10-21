package controller;

public interface Controller<T> {

    T create(String data);

    T read (Long id);

    T update (String data);

    Boolean delete (Long id);

}
