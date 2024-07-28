package sem.generalizedProgramming3;

import java.util.Iterator;
import java.util.List;

public class Task3<T> implements Iterator<T> {

    private List<T> list;
    private int index;

    public Task3(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }

    @Override
    public void remove() {
        list.remove(index - 1);
    }
}
