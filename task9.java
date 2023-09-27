import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {

        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("Hvefveve");
        Optional<String> optional = func(op1, op2);

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println(Optional.empty());
        }
    }

    public static Optional<String> func (Optional<String> op1, Optional<String> op2) {
        if(op1.isEmpty() || op2.isEmpty()){
            return Optional.empty();
        }
        if(op1.get().length() > op2.get().length()) {
            return Optional.of(op1.get());
        }else {
            return Optional.of(op2.get());
        }
    }
}
