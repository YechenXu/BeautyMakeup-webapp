package boundedstack;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @param <E>
 */
public class ListStack<E> extends AbstractStack<E> {
    // representation
    private List<E> contents;
    private int capacity;

    // contents = ?? and capacity = ? ==> stack = [??]:?
    // contents = <A, B, C> and capacity = 6 ==> stack = [A, B, C]:6

    public ListStack(int max) {
        contents = new LinkedList<>();
        capacity = max;
    }

    @Override
    public void push(E element) throws IllegalStateException, IllegalArgumentException {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
