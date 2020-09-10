package exp2;

public interface AbstractFactory<T> {
    T create(String type) ;
}