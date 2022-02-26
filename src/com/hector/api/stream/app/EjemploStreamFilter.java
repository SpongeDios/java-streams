package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args){

        Stream.of("Pato", "Paco", "Pepe", "Pepa")
                .map(nombre -> {
                    return nombre.toUpperCase(Locale.ROOT);
                }).forEach(System.out::println);

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.getApellido()));





    }
}
