package com.hector.api.stream.app;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRango {
    public static void main(String[] args){

        IntStream numeros = IntStream.range(5,20).peek(System.out::println);

//        int resultado = nombres.reduce(0, Integer::sum);
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("maximo: "+stats.getMax());
        System.out.println("minimo: "+stats.getMin());
        System.out.println("promedio: "+stats.getAverage());
        System.out.println("total: "+stats.getCount());
        System.out.println("suma: "+stats.getSum());
        System.out.println(stats);

    }
}
