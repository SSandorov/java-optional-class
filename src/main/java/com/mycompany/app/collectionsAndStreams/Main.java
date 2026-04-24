package com.mycompany.app.collectionsAndStreams;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //* Ejemplo 1
        List<String> names = List.of("Juan", "Ana", "Andrea", "Teddy", "Ricardo");

        Optional<String> first = names.stream().findFirst();

        first.ifPresent(name -> System.out.println("El primero es: " + name));

        //* Ejemplo 2
        List<String> emptyList = List.of();

        Optional<String> firstEmpty = emptyList.stream().findFirst();
        System.out.println("Esta presente? " + firstEmpty.isPresent());

        //* Ejemplo 3
        record Product(String name, double price) {};

        List<Product> products = List.of(
            new Product("TV", 200),
            new Product("Netbook", 400)

        );

        Optional<Product> maybeTV = products.stream()
            .filter(p -> p.name().equalsIgnoreCase("tv"))
            .findFirst();

        Product result = maybeTV.orElse(new Product("generico", 0));

        System.out.println("Resultado: " + result.name + " - $" + result.price);

        //* Ejemplo 4
        String maybeName = null;

        Optional.ofNullable(maybeName)
            .ifPresentOrElse(
                name -> System.out.println("Nombre encontado: " + name),
                () -> System.out.println("No se encontro ningun nombre")
            );

        //* Ejemplo 5
        List<Optional<String>> optionals = List.of(
            Optional.of("Hola"),
            Optional.empty(),
            Optional.of("Adios")
        );

        optionals.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .forEach(System.out::println);
    }
}
