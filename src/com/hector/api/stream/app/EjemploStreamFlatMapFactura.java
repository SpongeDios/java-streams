package com.hector.api.stream.app;

import com.hector.api.stream.app.models.Factura;
import com.hector.api.stream.app.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Jhon", "Doe");
        Usuario usuario1 = new Usuario("Pepe", "Lotas");

        usuario.addFacturas(new Factura("Factura brigida y Compras de tecnologia"));
        usuario.addFacturas(new Factura("cualquier wea"));

        usuario1.addFacturas(new Factura("bicicleta"));
        usuario1.addFacturas(new Factura("notebook"));

        List<Usuario> usuarios = Arrays.asList(usuario, usuario1);

        usuarios.stream()
                .flatMap(usuarioxd -> usuarioxd.getFacturas().stream())
                .forEach(factura -> System.out.println(factura.getDescripcion()
                .concat(" : cliente ")
                .concat(factura.getUsuario().getNombre()
                .concat(" ")
                .concat(factura.getUsuario().getApellido()))));
    }


}
