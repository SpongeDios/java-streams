package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args){

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();
        nombres.forEach(System.out::println);
    }
}
