package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args){

        Usuario usuario = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(1))
                .findFirst().get();

        System.out.println(usuario);


    }
}
