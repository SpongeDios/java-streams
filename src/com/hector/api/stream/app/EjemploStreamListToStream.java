package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class EjemploStreamListToStream {

    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Hector", "Alvarado"));
        lista.add(new Usuario("Andres", "Guzman"));
        lista.add(new Usuario("Henrry", "Mejia"));
        lista.add(new Usuario("Waton", "Thanos"));
        lista.add(new Usuario("Guz", "Guziano"));
        lista.add(new Usuario("Lalo", "XD"));
        lista.add(new Usuario("pepe", "lotas"));
        lista.add(new Usuario("pepe", "grillo"));


        lista.stream()
                .map(u -> u.getNombre().toUpperCase(Locale.ROOT)
                .concat(" ")
                .concat(u.getApellido()).toUpperCase(Locale.ROOT))
                .flatMap(nombre -> {
                    if (nombre.contains("PEPE")){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .map(nombre -> nombre.toLowerCase(Locale.ROOT))
                .forEach(System.out::println);
    }
}
