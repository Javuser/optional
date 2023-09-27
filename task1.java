import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class task1 {
    public static void main(String[] args) {

        Optional<List<Integer>> optional = func(new ArrayList<>());
        if (optional.isPresent()) {
            System.out.println("List: " + optional.get());
        } else {
            System.out.println("Empty list");
        }
    }

    public static Optional<List<Integer>> func (List < Integer > list) {
        list.add(4);
        list.add(5);
        list.add(-1);
        list.add(99);

        if (list.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(list);
        }
    }
}
