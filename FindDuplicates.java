import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

  public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
    List<Integer> duplicates = new ArrayList<>();
    for (int i = 0; i < l.size(); i++) {
      Integer current = l.get(i);
      for (int j = 0; j < i; j++) {
        if (current.equals(l.get(j))) {
          duplicates.add(current);
          break;
        }
      }
    }

    return new HashSet<>(duplicates)
        .stream()
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
  }

  public static void main(String[] args) {
    List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
    List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
    List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
    List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
    System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
    System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
    System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
    System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
  }
}
