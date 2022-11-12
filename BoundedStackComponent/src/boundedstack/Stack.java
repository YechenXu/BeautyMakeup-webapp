package boundedstack;

/**
 * <p>
 *     A bounded, last-in first-out data structure. Elements in the stackmay not be null.</p>
 * <p>
 *     A typical string representation of a bounded stack is
 *     <code>[e_1, e_2, ..., e_n-1, e_n]:c</code>,
 *     where <code>e_1</code> is the bottom element of the stack
 *     and <code>e_n</code> is the top element,
 *     and <code>c</code> is the capacity.
 * </p>
 * <p>
 *     Implementations of this interface should have a one-argument constructor
 *     that takes the desired capacity and create an empty stack.
 *     The capacity must be strictly greater than zero.
 * </p>
 * <p><code>public Stack(int max)</code></p>
 * <p>
 *     A stack iterator through the stack from bottom to top.
 * </p>
 *
 * @author YechenXu
 * @param <E> the type of elements in this stack.
 */
public interface Stack<E> {

    /**
     * <p>
     *     Adds the specified element onto the top of this pipe.
     * </p>
     * <p>
     * Example:<br>
     * { <code>s = [A, B, C]:6 and x = X</code> }<br>
     * <code>s.push(x)</code><br>
     * { <code>s = [A, B, C, X] and x = X</code> }<br>
     * </p>
     *
     * @param element the element to be pushed onto this pipe.
     * @throws IllegalStateException if the stack is full
     * @throws IllegalArgumentException if the speified element is null
     */
    public void push(E element) throws IllegalStateException, IllegalArgumentException;

    /**
     * Removes and returns the top element from this stack.
     *
     * @return the top element from this stack.
     */
    public E pop();

    /**
     * Returns the number of elements in this stack.
     *
     * @return  the number of elements in this stack.
     */
    public int depth();

    /**
     * Returns the number of element that this stack can hold.
     *
     * @return the number of element that this stack can hold.
     */
    public int capacity();

}


