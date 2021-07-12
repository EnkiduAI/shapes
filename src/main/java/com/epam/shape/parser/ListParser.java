package com.epam.shape.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListParser {
    private static final String SPLIT_REGEX = "\\p{Punct}*\\s+";

    public List<double[]> parseToDouble(List<String> list) {
        List<double[]> listOfDouble = new ArrayList<>();
        for (String line : list) {
            String[] split = line.split(SPLIT_REGEX);
            double[] doubleArray = Stream.of(split).mapToDouble(Double::parseDouble).toArray();
            listOfDouble.add(doubleArray);
        }
        return listOfDouble;
    }
}
