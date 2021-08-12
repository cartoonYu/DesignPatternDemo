package demo.prototype;

public interface CopyService{

    <T>T copy(T obj, Class<T> classType);
}
