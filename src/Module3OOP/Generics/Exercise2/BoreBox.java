package Module3OOP.Generics.Exercise2;

public class BoreBox<T> implements CanGiveItems<T> {
    private T[] items;

    public BoreBox(T[] items) {
        this.items = items;
    }

    @Override
    public T getItem(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= this.items.length) {
            throw new ArrayIndexOutOfBoundsException("Out of index :(");
        }

        return items[index];
    }

    @Override
    public String getBoxName() {
        return "BoreBox";
    }


}
