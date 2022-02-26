package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args){

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Paco Gonzales", "Pepe Gutierrez", "Pepa Mena", "Pepe Lotas")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuarioOpcional = nombres.findFirst();
        System.out.println("Usuario opcional: " + usuarioOpcional.orElse(new Usuario("Jhon", "Doe")));
        System.out.println("Usuario opcional: " + usuarioOpcional.orElseGet(() -> new Usuario("Otro", "Usuario")));
//        System.out.println("Usuario opcional: " + usuarioOpcional.orElseThrow());
//        System.out.println(usuarioOpcional.get());
        usuarioOpcional.ifPresent(System.out::println);


    }
}
