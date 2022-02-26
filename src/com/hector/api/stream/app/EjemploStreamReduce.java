package com.hector.api.stream.app;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args){

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas", "Pato Guzman", "Pato Guzman", "Pato Guzman")
                .distinct();


        String resultado = nombres.reduce("", (a,b) -> a + " --- " + b);
        System.out.println("resultado = " + resultado);




    }
}
