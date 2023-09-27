import java.util.Optional;

public class task3 {
    public static void main(String[] args) {
        Optional<Integer> op1 = Optional.empty();
        Optional<Integer> op2 = Optional.of(4);
        Optional<Integer> optional = func(op1, op2);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println("empty optional ");
        }
    }

    public static Optional<Integer> func (Optional<Integer> op1, Optional <Integer> op2){

        if(op1.isEmpty() || op2.isEmpty()){
            return Optional.empty();
        }else {
            return Optional.of(op1.get() + op2.get());
        }
    }
}
