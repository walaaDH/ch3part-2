import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question2 {
   
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("a", "b", "c");

        List<String> upperCase = letters.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println(upperCase);
    }
} 

