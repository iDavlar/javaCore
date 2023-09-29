package Module3OOP.Generics.Exercise2;

import java.util.ArrayList;

public class FunBox<T> extends ArrayList<T> implements CanGiveItems<T> {
    @Override
    public T getItem(int index) throws ArrayIndexOutOfBoundsException {
        return super.get(index);
    }

    @Override
    public String getBoxName() {
        return "FunBox";
    }
}
