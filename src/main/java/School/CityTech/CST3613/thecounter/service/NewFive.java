package School.CityTech.CST3613.thecounter.service;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NewFive {
    public static int[] getNumber() {
        var data = IntStream.iterate(0, e -> e+5).limit(101)
                .map(e->(int)e)
                .toArray();

        return data;
    }

    public static void main(String[] args) {
        Arrays.stream(getNumber()).forEach(System.out::println);
    }
}
