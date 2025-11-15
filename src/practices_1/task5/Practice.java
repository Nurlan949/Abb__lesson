package practices_1.task5;

import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Character>symbol=List.of('a','b','c','d');
        var asciiMap=symbol.stream().map(s->new AsciiValur(s)).collect(Collectors.toSet());

        var asciiValue=symbol.stream().map(AsciiValur::new).collect(Collectors.toSet());
        System.out.println(asciiValue);
        System.out.println(asciiMap);
    }

}
