import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class task10 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        list2.add(5);
        list2.add(4);
        list2.add(0);
        list2.add(1);
        list2.add(9);

        Optional<List<Integer>> optional = func(list1, list2);

        if(optional.isPresent()) {
            System.out.println(optional.get());

        }else {
            System.out.println(Optional.empty());
        }
    }

    public static Optional<List<Integer>> func(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.contains(list2.get(i))) {
                list3.add(list2.get(i));
            }
        }
        return Optional.of(list3);
    }
}
