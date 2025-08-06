package dev.ggorantala.ds.arrays.theory.resizable;

/**
 * This class contains various assignments for demonstrating and creating dynamic arrays (such as
 * declaration, initialization, and doubling the array). This class also contains some methods that
 * creates array like behavior.
 *
 * <p>This class is strictly replicating basic array features such as: - insertion, - deletion, -
 * getting an item from an index, - size of array - printing array elements
 *
 * @author ggorantala
 */
public class DynamicArray {
  private int[] data;
  private int size;

  public DynamicArray(int capacity) {
    data = new int[capacity];
    size = 0;
  }

  public void insert(int element) {

    // if the array is full, resize it
    if (data.length == size) {
      // create a new array (twice the size)
      int[] newData = new int[size * 2];

      // copy all existing items
      System.arraycopy(data, 0, newData, 0, size);
      data = newData;
    }
    data[size] = element;
    size++;
  }

  public boolean isOutOfBounds(int index) {
    return index < 0 || index >= size;
  }

  public void remove(int index) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    }

    for (int i = index; i < size; i += 1) {
      data[i] = data[i + 1];
    }
    size--;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public int size() {
    return size;
  }

  public void print() {
    for (int i = 0; i < data.length; i += 1) {
      System.out.print(data[i] + ", ");
    }
  }
}
