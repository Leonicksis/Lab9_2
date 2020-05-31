package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("Input.txt");
        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
        }
        Map<Character, List<String>> map = lines.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        map.forEach((key, val) -> System.out.println(key + ": " + val));
    }
}