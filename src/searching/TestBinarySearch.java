package searching;

import java.util.*;

public class TestBinarySearch {

  public static void main(String[] args) {
    SortedListInterface<Integer> numList = new SortedArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 100; i ++) {
      numList.add(i);
    }

    System.out.println("numList contains: ");
    numList.display();

    System.out.print("\nEnter a target number, 0 to exit: ");
    int target = scanner.nextInt();
    while (target != 0) {
      System.out.println("\nnumList contains " + target + ": " + numList.getPosition(target));
      System.out.print("Enter a target number, 0 to exit: ");
      target = scanner.nextInt();
    }

    System.out.println();

  }
}
