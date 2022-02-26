package com.hector.api.stream.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args){

        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepe", "Pepa");
        nombres.forEach(System.out::println);

        String[] arr = {"Pato", "Paco", "Pepe", "Pepa"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        Stream<String> masNombres = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pato")
                .add("Pepe")
                .build();
        masNombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");

        Stream<String> otrosNombres = lista.stream();
        otrosNombres.forEach(System.out::println);

        lista.forEach(System.out::println);

    }
}
