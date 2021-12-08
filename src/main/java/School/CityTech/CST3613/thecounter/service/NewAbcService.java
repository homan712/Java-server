package School.CityTech.CST3613.thecounter.service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NewAbcService {
    public static Character[] getABC() {
        var data = IntStream.iterate(65, e -> e +1).limit(26)
                .mapToObj(e -> (char) e)
                .toArray(Character[]::new);

        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(getABC()).forEach(System.out::print);
    }
}
