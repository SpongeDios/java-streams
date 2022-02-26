package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args){

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(u -> {
                    if (u.getNombre().equalsIgnoreCase("pepe")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        nombres.forEach(System.out::println);







    }
}
