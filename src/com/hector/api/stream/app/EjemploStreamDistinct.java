package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args){

        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas", "Pato Guzman", "Pato Guzman", "Pato Guzman")
                .distinct();


        nombres.forEach(System.out::println);




    }
}
