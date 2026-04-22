package com.mycompany.app.filter;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> dni = Optional.of("123456");

        Optional<String> result = dni.filter( d -> d.startsWith("1") );

        System.out.println("DNI: " + result.orElse("Invalido"));

        Optional<String> email = Optional.ofNullable("   gabriel@devtalles.com    ");

        String sanitizedEmail = email
            .map(String::trim)
            .filter(em -> em.contains("@"))
            .orElse("Invalido");

        System.out.println("EMAIL: " + sanitizedEmail);
    }
}
