package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {

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

        long t1 = System.currentTimeMillis();
        String resultado = lista.parallelStream()
                .map(u -> u.toString().toUpperCase(Locale.ROOT))
                .peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName() + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (nombre.contains("PEPE")) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");


        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: "+ (t2-t1));
//        System.out.println(resultado);
    }
}
