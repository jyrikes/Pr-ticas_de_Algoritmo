import java.util.Random;

public class Quick {

  public static void main(String[] args) {
    Quick quickSort = new Quick();
    int[] array = {-1, 1, 5, 7, 0, 3, 5};
    quickSort.sort(array);
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public int[] sort(int[] elements) {
    sort(elements, 0, elements.length);
    return elements;
  }

  private void sort(int[] elements, int startIndex, int endIndex) {
    if (startIndex >= endIndex - 1) {
      return;
    }

    int pivotIndex = new Random().nextInt(endIndex - 1 - startIndex) + startIndex;
    int leftIndex = partition(elements, startIndex, endIndex, pivotIndex);
    sort(elements, startIndex, leftIndex - 1);
    sort(elements, leftIndex + 1, endIndex - 1);
  }

  public int partition(int[] elements, int startIndex, int endIndex, int pivotIndex) {
    int pivot = elements[pivotIndex];
    int endIndexMinusOne = endIndex - 1;

    while (startIndex < endIndexMinusOne) {
      while (elements[startIndex] <= pivot && startIndex < endIndexMinusOne) {
        startIndex++;
      }
      while (elements[endIndexMinusOne] >= pivot && startIndex < endIndexMinusOne) {
        endIndexMinusOne--;
      }
      swap(elements, startIndex, endIndexMinusOne);
    }

    swap(elements, startIndex, endIndex - 1);
    
    return startIndex;
  }

  private void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }

}
