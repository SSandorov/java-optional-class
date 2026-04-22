package com.mycompany.app;

import java.util.Optional;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //* La clase Optional es una clase contenedora disenada para manejar los casos de NullPointerException
        //* de una manera mas elegante y util

        //* Es una clase contenedora que puedo o no contener un valor
        //* Disenada para evitar el uso del null
        //* En lugar de retornar un null retorna un Optional vacio

        Optional<String> name = Optional.of("Gabriel");

        if (name.isPresent()) {
            System.out.println("El nombre esta presente");
        }

        String value = null;
        //* El ofNullable nos devuelve un objeto vacio si recibe un Null
        Optional<String> nick = Optional.ofNullable(value);

        if(nick.isPresent()) {
            System.out.println("El nick esta presente");
        } else {
            System.out.println("Vacio");
        }

        Optional<String> greeting = Optional.of("Hola mundo");

                //* ifPresent recibe como argumento un consumer
        greeting.ifPresent(message -> System.out.println("Soy Gabriel: " + message));


        //? Uso del optional orElse()

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Ingrese su nombre: ");
        // String name2 = scanner.nextLine();

        // Optional<String> optionalName = Optional.empty();

        // if (name2.isEmpty()) {
        //     //* Nos permite tener un valor por defecto
        //     name2 = optionalName.orElse("Invitado");
        // }

        // System.out.println(name2);

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nameInput = scanner2.nextLine();

        Optional<String> optional = Optional.ofNullable(nameInput)
            .filter(n -> !n.isEmpty());


        //? Uso del orElseGet()
        //* incluye el condicional que tuvimos que anadir al orElse del ejemplo anterior
                                        //* es un supplier, asi que no recibe nada pero retorna un nuevo valor
        String name3 = optional.orElseGet(() -> "Invitado");
        System.out.println(name3);

        //? Uso del orElseThrow()
        //* Al igual que orElseGet() es un supplier y nos devuelve un error
        // String name3 = optional.orElseThrow(() -> new IllegalStateException("Error"));

    }
}
