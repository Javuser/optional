import java.util.Optional;

public class task8 {
    public static void main(String[] args) {
        int n = 5;
        Optional<Boolean> optional = func(n);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }else {
            System.out.println(Optional.empty());
        }
    }

    public static Optional<Boolean> func (int n) {
        return Optional.of((n % 2 == 0) ? true: false);
    }

}
