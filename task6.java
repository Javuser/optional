import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class task6 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        list.add("Mentor");

        String str = "fg";
        Optional<Boolean> optional = func(list, str);
        System.out.println(optional.get());
    }

    public static Optional<Boolean> func (List<String> list, String str) {
        if(list.contains(str)){
            return Optional.of(true);
        }else {
            return Optional.of(false);
        }
    }
}
