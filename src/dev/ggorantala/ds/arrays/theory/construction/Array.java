package dev.ggorantala.ds.arrays.theory.construction;

/**
 * This class contains various assignments for demonstrating and creating arrays (such as
 * declaration and initialization). This class also contains some methods that creates array like
 * behavior.
 *
 * <p>This class is strictly replicating basic array features such as: - insertion, - deletion, -
 * getting an item from an index, - size of array - printing array elements
 *
 * @author ggorantala
 */
public class Array {

  private final int[] data;
  private int size;

  // constructor accepting the size before array declaration
  public Array(int capacity) {
    data = new int[capacity];
    size = 0;
  }

  // inserting an item at the end
  public void insert(int element) {
    data[size] = element;
    size++;
  }

  // checking if index is out of array boundary
  public boolean isOutOfBounds(int index) {
    return index < 0 || index >= size;
  }

  // removing an item from array
  public void remove(int index) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    }

    for (int i = index; i < size; i += 1) {
      data[i] = data[i + 1];
    }
    size--;
  }

  // get an element at index
  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  // size of array
  public int size() {
    return size;
  }

  // printing array elements
  public void print() {
    for (int i = 0; i < data.length; i += 1) {
      System.out.print(data[i] + ", ");
    }
  }
}
