import java.util.Optional;

public class task2 {
    public static void main(String[] args) {
        Optional<String> optional = func("Hello world43, nkvje !@#");

        System.out.println(optional.get());
    }

    public static Optional<String> func (String symbolsOnly) {

        StringBuilder stringBuilder = new StringBuilder();
        for(char ch: symbolsOnly.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                stringBuilder.append(ch);
            }
        }
        String res = stringBuilder.toString();
        if(res.isEmpty()) {
            return Optional.empty();
        }else {
            return Optional.of(res);
        }
    }
}
