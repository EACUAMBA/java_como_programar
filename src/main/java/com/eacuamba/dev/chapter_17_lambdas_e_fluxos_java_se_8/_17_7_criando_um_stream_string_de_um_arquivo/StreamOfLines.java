package com.eacuamba.dev.chapter_17_lambdas_e_fluxos_java_se_8._17_7_criando_um_stream_string_de_um_arquivo;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfLines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".").resolve("src").resolve("main").resolve("resources").resolve("files").resolve("Chapter2Paragraph.txt").toAbsolutePath();
        Pattern pattern = Pattern.compile("\\s+");

        TreeMap<String, Long> wordCounts = Files.lines(path, StandardCharsets.UTF_8)
                .peek(System.out::println)
                .map(line -> line.replaceAll("(?!')\\p{P}", ""))
                //O flatMap() serve para fazer map e retorna uma Stream que será acrescentada a stream original.
                .flatMap(new Function<String, Stream<String>>() {
                    @Override
                    public Stream<String> apply(String s) {
                        //System.out.println(pattern.pattern());
                        return Arrays.stream(s.split(pattern.pattern()));
                    }
                })
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()));

        wordCounts.entrySet()
                .stream()
                .peek(System.out::println)
                .collect(Collectors.groupingBy(entry -> entry.getKey().charAt(0), TreeMap::new, Collectors.toList()))
                .forEach((letter, wordList) -> {
                    System.out.printf("%n%C%n", letter);
                    wordList.stream().forEach(word -> System.out.printf("%13s: %d%n", word.getKey(), word.getValue()));
                });
    }

}
