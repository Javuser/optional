import java.util.Optional;

public class task4 {
    public static void main(String[] args) {
        String[] str = {"hello", "Nurbakyt", "Anzor", "Java"};
        String t = "Java";
        Optional<Integer> optional = func(str, t);

        if(optional.isPresent() && optional.get() != -1){
            System.out.println(optional.get());
        }if (optional.get() == -1){
            System.out.println(Optional.ofNullable(null));
        }
    }

    public static Optional<Integer> func(String[] str, String t){
        int res = -1;
        for (int i = 0; i < str.length; i++) {
            if(str[i] == t){
                res = i;
                break;
            }

        }
        return Optional.of(res);
    }
}
