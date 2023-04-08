package trees;

import java.util.List;

public interface ITree<T extends Comparable<T>>
{
    /**
     * Adds or updates an element in the binary search tree. Given bst.addUpdate(a), there are two
     * scenarios to consider:
     *
     * Scenario #1: There is no element "b" in the tree for which a.compareTo(b) == 0
     * (i.e. the objects are considered equal). Then "a" should be added to the binary search tree.
     *
     * Scenario #2: There is an element "b", already in the tree, for which a.compareTo(b) == 0.
     * Then "b" should replace "a" in the node containing "a".
     *
     * This method returns true when a new element is added and false if an update occurred.
     *
     * Note: The reasoning behind this logic will become more clear as you progress in the assignment.
     *
     * Note: We are still not allowing duplicates at this point. Instead, we are allowing updates to
     * an object in the BST.
     *
     * @param element the new or updated element
     * @return true if the element was inserted or updated in the tree, otherwise returns false
     */
    boolean add(T element);

    /**
     * Returns true if the input element is in the tree, otherwise it returns false.
     *
     * @param element the element to search for
     * @return true if the input element is found, or false otherwise
     */
    boolean contains(T element);

    /**
     * Given an input element "a", this returns the element "b" such that
     * a.compareTo(b) == 0 (i.e. the objects are considered equal).
     *
     * @param element the element to search for
     * @return the matching element
     */
    T get(T element);

    /**
     * This returns the number of elements in the tree.
     * @return the number of elements
     */
    int size();

    /**
     * This returns true if there are no elements in the tree,
     * but otherwise returns false.
     * @return true if the tree is empty, or otherwise false.
     */
    boolean isEmpty();

    /**
     * This removes all elements in the tree.
     */
    void clear();

    /**
     * Returns a sorted list of all elements in the tree, using the
     * In-Order tree traversal of the underlying structure.
     *
     * @return
     */
    List<T> inOrder();
}
