package Module3OOP.Generics.Exercise2;

public interface CanGiveItems<T> {
    public T getItem(int index) throws ArrayIndexOutOfBoundsException;

    public String getBoxName();
}
