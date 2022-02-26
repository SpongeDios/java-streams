package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args){

        Long nombres = Stream.of("", "Paco Gonzales", "Pepe Gutierrez", "", "Pepe Lotas")
                .peek(System.out::println)
                .filter(String::isEmpty)
                .count();
        System.out.println("nombres = " + nombres);
    }
}
